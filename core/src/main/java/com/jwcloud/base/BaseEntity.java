package com.jwcloud.base;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.Date;

@Data
public class BaseEntity {
    @JsonIgnore
    private int Id;
    /* 入库时间 */
    private Date createdAt;
    /* 最后一次更新时间 */
    private Date updatedAt;
}
