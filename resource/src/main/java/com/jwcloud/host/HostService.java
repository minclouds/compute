package com.jwcloud.host;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jwcloud.base.BaseService;
import com.jwcloud.flavor.FlavorEntity;
import com.jwcloud.flavor.FlavorService;
import com.jwcloud.pod.PodEntity;
import com.jwcloud.pod.PodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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
        return null;
    }

    @Override
    public HostEntity update(String id, HostDto dto) {
        return null;
    }

    /**
     * 获取宿主机基本信息。
     */
    @Override
    public HostEntity getById(String id) {

        return mapper.selectOne(new LambdaQueryWrapper<HostEntity>()
                .eq(HostEntity::getHostUuid, id).ne(HostEntity::getState, HostState.deleted));
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

    /**
     * 预占主机资源
     */
    public String allocate(HostAllocateDto dto) {
        FlavorEntity flavor = flavorService.getById(dto.getFlavorId());
        List<PodEntity> pods = podService.listByTag(flavor.getFlavorName());
        pods.forEach(pod -> {
            List<HostEntity> hosts = list(pod.getId());
            for (HostEntity host : hosts) {
                if (!host.getState().equals(HostState.available)) {
                    continue;
                }
                
            }
        });


        return null;
    }
}
