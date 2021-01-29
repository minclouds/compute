package com.jwcloud.goup;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jwcloud.base.BaseService;
import com.jwcloud.base.BaseState;
import com.jwcloud.flavor.FlavorService;
import com.jwcloud.flavor.FlavorTag;
import com.jwcloud.pod.PodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GroupService implements BaseService<GroupEntity, GroupDto> {
    @Autowired
    private GroupMapper mapper;
    @Autowired
    private PodService podService;
    @Autowired
    private FlavorService flavorService;

    @Override
    public GroupEntity insert(GroupDto dto) {
        GroupEntity entity = new GroupEntity(dto);
        entity.setCreatedAt(new Date());
        entity.setUpdatedAt(new Date());
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

        return Optional.ofNullable(mapper.selectOne(new LambdaQueryWrapper<GroupEntity>()
                .eq(GroupEntity::getGroupUuid, id).ne(GroupEntity::getState, BaseState.deleted))
        ).orElseThrow(() -> new GroupException(GroupMessage.NotFound, id));
    }

    @Override
    public GroupEntity detail(String id) {
        GroupEntity entity = getById(id);
        entity.setPods(podService.listByGroupId(entity.getId()));
        List<FlavorTag> tags = new ArrayList<>();
        tags.add(entity.getEcsFlavorTag());
        tags.add(entity.getEbsFlavorTag());
        entity.setFlavors(flavorService.listByTag(tags));

        return entity;
    }

    @Override
    public List<GroupEntity> list(Map<String, Object> columnMap) {

        return mapper.selectByMap(columnMap);
    }
}
