package com.jwcloud.host;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jwcloud.base.BaseEntity;
import com.jwcloud.host.disk.HostDiskEntity;
import com.jwcloud.host.gpu.HostGpuEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * 宿主机信息获取
 */
@EqualsAndHashCode(callSuper = true)
@Data
@TableName("tbl_host")
public class HostEntity extends BaseEntity {
    /** 设备序列号 */
    private String hostUuid;
    /** 主机名称 */
    private String hostName;
    /** 物理CPU个数 */
    private int cpu;
    /** 内存容量 */
    private int memory;
    /** 虚拟化类型 */
    private String type;
    /** 管理地址 */
    private String manageIp;
    /** agent上服务端口 */
    private int managePort;
    /** 最大主机数量 */
    private int serverMax;
    /** 最大主机数量 */
    private int serverCount;
    /** 状态 */
    private HostState state;
    /** 主机状态 */
    private HostStatus status;
    /** Pod标识 */
    private int podId;
    @TableField(exist = false)
    private List<HostDiskEntity> disks;
    @TableField(exist = false)
    private List<HostGpuEntity> gpus;
}
