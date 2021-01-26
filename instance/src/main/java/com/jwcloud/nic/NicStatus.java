package com.jwcloud.nic;

/**
 * 网卡在虚拟机上的状态
 * unknown：待添加
 * up：连接
 * down：断开连接
 * deleted：已删除
 */
public enum NicStatus {
    unknown,
    up,
    down,
    deleted,
}
