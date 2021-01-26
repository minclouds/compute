package com.jwcloud.disk;

/**
 * 磁盘状态
 * unknown：尚未创建
 * ready：已经创建
 * paired: 已与计算节点配对
 * mapped：已与计算节点挂载
 * attached：已于业务主机挂载
 * deleted：已删除
 */
public enum DiskStatus {
    unknown,
    ready,
    paired,
    mapped,
    attached,
    deleted,
}
