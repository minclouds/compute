package com.jwcloud.base;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.jwcloud.rest.RestResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BaseController<S extends BaseService, E extends BaseEntity, D extends BaseDto> {

    @Autowired
    private S service;

    @ApiOperation(value = "集群创建时需要纳管或录入的预配置信息")
    @PostMapping("/add")
    @SuppressWarnings("unchecked")
    public RestResult<E> insert(@RequestBody D dto) {
        E entity = (E) service.insert(dto);

        return RestResult.success(entity);
    }

    @ApiOperation(value = "删除预配置信息")
    @PostMapping("{id}/delete")
    @SuppressWarnings("unchecked")
    public RestResult<E> delete(@PathVariable String id) {
        E entity = (E) service.delete(id);

        return RestResult.success(entity);
    }

    @ApiOperation(value = "删除预配置信息")
    @PostMapping("{id}/update")
    @SuppressWarnings("unchecked")
    public RestResult<E> update(@PathVariable String id, @RequestBody D dto) {
        E entity = (E) service.update(id, dto);

        return RestResult.success(entity);
    }

    @ApiOperation(value = "获取预配置信息")
    @GetMapping("/getById")
    @SuppressWarnings("unchecked")
    public RestResult<E> getById(@RequestParam String id) {
        E entity = (E) service.getById(id);

        return RestResult.success(entity);
    }

    @ApiOperation(value = "获取预配置信息详情")
    @GetMapping("/detail")
    @SuppressWarnings("unchecked")
    public RestResult<E> detail(String id) {
        E entity = (E) service.detail(id);

        return RestResult.success(entity);
    }

    @ApiOperation(value = "获取预配置信息列表")
    @GetMapping("/list")
    @SuppressWarnings("unchecked")
    public RestResult<List<E>> list(@RequestParam Map<String, Object> params) {
        Map<String, Object> columnMap = new HashMap<>();
        params.forEach((k,v) -> columnMap.put(StringUtils.camelToUnderline(k), v));
        List<E> entities = service.list(columnMap);

        return RestResult.success(entities);
    }
}
