package com.jwcloud.goup;

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
public class GroupService implements BaseService<GroupEntity, GroupDto> {
    @Autowired
    private GroupMapper mapper;

    @Override
    public GroupEntity insert(GroupDto dto) {
        GroupEntity entity = new GroupEntity(dto);
        mapper.insert(entity);

        return entity;
    }

    @Override
    public GroupEntity delete(String id) {
        GroupEntity entity = getById(id);
        entity.setState(BaseState.deleted);
        entity.setUpdatedAt(new Date());
        mapper.updateById(entity);

        return entity;
    }

    @Override
    public GroupEntity update(String id, GroupDto dto) {
        GroupEntity group = getById(id);
        GroupEntity entity = new GroupEntity(dto);
        entity.setId(group.getId());
        entity.setUpdatedAt(new Date());

        return entity;
    }

    @Override
    public GroupEntity getById(String id) {

        return mapper.selectOne(new LambdaQueryWrapper<GroupEntity>()
                .eq(GroupEntity::getGroupUuid, id).ne(GroupEntity::getState, BaseState.deleted));
    }

    @Override
    public GroupEntity detail(String id) {

        return getById(id);
    }

    @Override
    public List<GroupEntity> list(Map<String, Object> columnMap) {

        return mapper.selectByMap(columnMap);
    }
}
