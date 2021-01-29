package com.jwcloud.cluster;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jwcloud.base.BaseService;
import com.jwcloud.base.BaseState;
import com.jwcloud.pod.PodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ClusterService implements BaseService<ClusterEntity, ClusterDto> {
    @Autowired
    private ClusterMapper mapper;
    @Autowired
    private PodService podService;

    @Override
    public ClusterEntity insert(ClusterDto dto) {
        ClusterEntity entity = new ClusterEntity(dto);
        entity.setCreatedAt(new Date());
        entity.setUpdatedAt(new Date());
        mapper.insert(entity);

        return entity;
    }

    @Override
    public ClusterEntity delete(String id) {
        ClusterEntity entity = detail(id);
        if (entity.getPods() != null)
            throw new ClusterException(ClusterMessage.NotAllowed, id);
        entity.setState(BaseState.deleted);
        entity.setUpdatedAt(new Date());
        mapper.updateById(entity);

        return entity;
    }

    @Override
    public ClusterEntity update(String id, ClusterDto dto) {
        ClusterEntity cluster = getById(id);
        ClusterEntity entity = new ClusterEntity(dto);
        entity.setId(cluster.getId());
        entity.setUpdatedAt(new Date());
        mapper.updateById(entity);

        return entity;
    }

    @Override
    public ClusterEntity getById(String id) {

        return Optional.ofNullable(mapper.selectOne(new LambdaQueryWrapper<ClusterEntity>()
                .eq(ClusterEntity::getClusterUuid, id).ne(ClusterEntity::getState, BaseState.deleted))
        ).orElseThrow(() -> new ClusterException(ClusterMessage.NotFound, id));
    }

    @Override
    public ClusterEntity detail(String id) {
        ClusterEntity entity = getById(id);
        entity.setPods(podService.listByClusterId(entity.getId()));

        return entity;
    }

    @Override
    public List<ClusterEntity> list(Map<String, Object> columnMap) {

        return mapper.selectByMap(columnMap);
    }
}
