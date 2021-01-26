package com.jwcloud.flavor;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.handlers.JacksonTypeHandler;
import com.jwcloud.base.BaseEntity;
import com.jwcloud.base.BaseState;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
@TableName(value = "tbl_flavor", autoResultMap = true)
public class FlavorEntity extends BaseEntity implements Serializable {
    /* 规格唯一标识 */
    private String flavorUuid;
    /* 规格名称 */
    private String flavorName;
    /* 规格限速 */
    @TableField(typeHandler = JacksonTypeHandler.class)
    private Object qos;
    /* 标签 */
    private FlavorTag tag;
    /** 规格状态 */
    private BaseState state;

    public FlavorEntity(FlavorDto dto) {
        this.flavorUuid = dto.getUuid();
        this.flavorName = dto.getName();
        this.qos = dto.getEcsQos() != null ? dto.getEcsQos() : dto.getEbsQos();
        this.state = dto.getState();
    }
}
