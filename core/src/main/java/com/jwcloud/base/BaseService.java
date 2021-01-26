package com.jwcloud.base;

import java.util.List;
import java.util.Map;

public interface BaseService<E extends BaseEntity, D extends BaseDto> {

    E insert(D dto);

    E delete(String id);

    E update(String id, D dto);

    E getById(String id);

    E detail(String id);

    List<E> list(Map<String, Object> columnMap);
}
