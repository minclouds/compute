package com.jwcloud.flavor;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jwcloud.base.BaseService;
import com.jwcloud.base.BaseState;
import com.jwcloud.goup.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class FlavorService implements BaseService<FlavorEntity, FlavorDto> {
    @Autowired
    private FlavorMapper mapper;
    @Autowired
    private GroupService groupService;

    @Override
    public FlavorEntity insert(FlavorDto dto) {
        FlavorEntity entity = new FlavorEntity(dto);
        entity.setCreatedAt(new Date());
        entity.setUpdatedAt(new Date());
        mapper.insert(entity);

        return entity;
    }

    @Override
    public FlavorEntity delete(String id) {
        FlavorEntity entity = detail(id);
        entity.setState(BaseState.deleted);
        entity.setUpdatedAt(new Date());

        return entity;
    }

    @Override
    public FlavorEntity update(String id, FlavorDto dto) {
        FlavorEntity flavor = getById(id);
        FlavorEntity entity = new FlavorEntity(dto);
        entity.setId(flavor.getId());
        entity.setUpdatedAt(new Date());

        return entity;
    }

    @Override
    public FlavorEntity getById(String id) {

        return Optional.ofNullable(mapper.selectOne(new LambdaQueryWrapper<FlavorEntity>()
                .eq(FlavorEntity::getFlavorUuid, id).ne(FlavorEntity::getState, BaseState.deleted))
        ).orElseThrow(() -> new FlavorException(FlavorMessage.NotFound, id));
    }

    @Override
    public FlavorEntity detail(String id) {
        FlavorEntity entity = getById(id);

        return entity;
    }

    @Override
    public List<FlavorEntity> list(Map<String, Object> columnMap) {

        return mapper.selectByMap(columnMap);
    }

    /**
     * 查询标签所应用的标签组
     */
    public List<FlavorEntity> listByTag(List<FlavorTag> tags) {

        return mapper.selectList(new LambdaQueryWrapper<FlavorEntity>()
                .ne(FlavorEntity::getState, BaseState.deleted)
                .in(FlavorEntity::getTag, tags)
        );
    }
}
