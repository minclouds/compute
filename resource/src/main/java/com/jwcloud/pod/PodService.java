package com.jwcloud.pod;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jwcloud.base.BaseService;
import com.jwcloud.base.BaseState;
import com.jwcloud.cluster.ClusterEntity;
import com.jwcloud.cluster.ClusterService;
import com.jwcloud.host.HostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class PodService implements BaseService<PodEntity, PodDto> {
    @Autowired
    private PodMapper mapper;
    @Autowired
    private ClusterService clusterService;
    @Autowired
    private HostService hostService;

    @Override
    public PodEntity insert(PodDto dto) {
        ClusterEntity cluster = clusterService.getById(dto.getClusterId());
        PodEntity entity = new PodEntity(dto, cluster.getId());
        mapper.insert(entity);

        return entity;
    }

    @Override
    public PodEntity delete(String id) {
        PodEntity entity = detail(id);
        if (entity.getHosts() != null)
            throw new PodException(PodMessage.NotAllowed, id);
        entity.setState(BaseState.deleted);
        entity.setUpdatedAt(new Date());
        mapper.updateById(entity);

        return entity;
    }

    @Override
    public PodEntity update(String id, PodDto dto) {
        PodEntity pod = getById(id);
        PodEntity entity = new PodEntity(dto, pod.getClusterId());
        entity.setId(pod.getId());
        entity.setUpdatedAt(new Date());

        return entity;
    }

    @Override
    public PodEntity getById(String id) {

        return mapper.selectOne(new LambdaQueryWrapper<PodEntity>()
                .eq(PodEntity::getPodUuid, id).ne(PodEntity::getState, BaseState.deleted));
    }

    @Override
    public PodEntity detail(String id) {
        PodEntity entity = getById(id);
        entity.setHosts(hostService.list(entity.getId()));

        return entity;
    }

    @Override
    public List<PodEntity> list(Map<String, Object> columnMap) {

        return mapper.selectByMap(columnMap);
    }

    /**
     * 查询集群里Pod列表
     */
    public List<PodEntity> listByClusterId(int clusterId) {
        List<PodEntity> entities = mapper.selectList(new LambdaQueryWrapper<PodEntity>()
                .eq(PodEntity::getClusterId, clusterId).ne(PodEntity::getState, BaseState.deleted));
        entities.forEach(entity -> {
            entity.setHostCount(hostService.getCount(entity.getId()));
        });

        return entities;
    }

    /**
     * 查询相同分组标签POD列表
     */
    public List<PodEntity> listByGroupId(int groupId) {

        return mapper.selectList(new LambdaQueryWrapper<PodEntity>()
                .eq(PodEntity::getGroupId, groupId).ne(PodEntity::getState, BaseState.deleted));
    }
}
