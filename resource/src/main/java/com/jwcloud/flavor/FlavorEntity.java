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
public class FlavorEntity<T> extends BaseEntity implements Serializable {
    /* 规格唯一标识 */
    private String flavorUuid;
    /* 规格名称 */
    private String flavorName;
    /* 服务器所使用的硬件信息 */
    @TableField(typeHandler = JacksonTypeHandler.class)
    protected T qos;
    /** 规格状态 */
    private BaseState state;

    @SuppressWarnings("unchecked")
    public FlavorEntity(EcsFlavorDto dto) {
        this.flavorUuid = dto.getUuid();
        this.flavorName = dto.getName();
        this.qos = (T) dto.getQos();
        this.state = dto.getState();
    }
}
