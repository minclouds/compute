package com.jwcloud.host.device.disk;

import com.jwcloud.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class HostDiskEntity extends BaseEntity {
    /** 卷符 */
    private String target;
    /* 磁盘路径 */
    private String path;
    /*  卷l类型 */
    private String type;
    /* 磁盘大小 单位: GiB */
    private long size;
    /* 状态 */
    private String state;
    /* 主机id  */
    private Integer hostId;
}
