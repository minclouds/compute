package com.jwcloud.flavor;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.jwcloud.base.BaseService;
import com.jwcloud.base.BaseState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class FlavorService implements BaseService<FlavorEntity, FlavorDto> {
    @Autowired
    private FlavorMapper mapper;

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
        FlavorEntity entity = getById(id);
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

        return mapper.selectOne(new LambdaQueryWrapper<FlavorEntity>()
                .eq(FlavorEntity::getFlavorUuid, id).ne(FlavorEntity::getState, BaseState.deleted));
    }

    @Override
    public FlavorEntity detail(String id) {

        return getById(id);
    }

    @Override
    public List<FlavorEntity> list(Map<String, Object> columnMap) {

        return mapper.selectByMap(columnMap);
    }
}
