package com.jwcloud.host.gpu;

import com.jwcloud.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class HostGpuEntity extends BaseEntity {
    /* 物理设备bus号 */
    private String bus;
    /* GPU类型 */
    private String type;
    /*  gpu设备状态 */
    private String state;
    /* 主机id  */
    private int hostId;
}
