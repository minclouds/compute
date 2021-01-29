package com.jwcloud.host;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jwcloud.base.BaseService;
import com.jwcloud.flavor.FlavorService;
import com.jwcloud.pod.PodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class HostService implements BaseService<HostEntity, HostDto> {
    @Autowired
    private HostMapper mapper;
    @Autowired
    private PodService podService;
    @Autowired
    private FlavorService flavorService;

    /**
     * 管理IP（段）纳管宿主机。
     */
    @Override
    public HostEntity insert(HostDto dto) {
        HostEntity entity = new HostEntity();

        return null;
    }

    /**
     * 宿主机下线。
     */
    @Override
    public HostEntity delete(String id) {
        HostEntity entity = getById(id);
        entity.setState(HostState.deleted);
        entity.setUpdatedAt(new Date());
        mapper.updateById(entity);

        return entity;
    }

    @Override
    public HostEntity update(String id, HostDto dto) {
        HostEntity entity = getById(id);
        entity.setType(dto.getType());
        entity.setUpdatedAt(new Date());
        mapper.updateById(entity);

        return entity;
    }

    /**
     * 获取宿主机基本信息。
     */
    @Override
    public HostEntity getById(String id) {

        return Optional.ofNullable(mapper.selectOne(new LambdaQueryWrapper<HostEntity>()
                .eq(HostEntity::getHostUuid, id).ne(HostEntity::getState, HostState.deleted))
        ).orElseThrow(() -> new HostException(HostMessage.NotFound, id));
    }

    /**
     * 获取宿主机详细信息。CPU、网卡、磁盘等
     */
    @Override
    public HostEntity detail(String id) {
        return null;
    }

    /**
     * 获取宿主机基本列表。
     */
    @Override
    public List<HostEntity> list(Map<String, Object> columnMap) {

        return mapper.selectByMap(columnMap);
    }
    /**
     * 根据Pod获取宿主机基本列表。
     */
    public List<HostEntity> list(int podId) {

        return mapper.selectList(new LambdaQueryWrapper<HostEntity>()
                .eq(HostEntity::getPodId, podId).ne(HostEntity::getState, HostState.deleted)
                .orderByAsc(HostEntity::getServerCount));
    }

    /**
     * 根据Pod获取宿主机个数。
     */
    public int getCount(int podId) {

        return mapper.selectCount(new LambdaQueryWrapper<HostEntity>()
                .eq(HostEntity::getPodId, podId).ne(HostEntity::getState, HostState.deleted));
    }
}
