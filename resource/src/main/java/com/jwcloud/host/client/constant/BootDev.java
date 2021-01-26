package com.jwcloud.host.client.constant;

/**
 * 操作系统启动方式
 * hd：硬盘启动 默认
 * cdrom：光驱启动
 * network：网卡启动
 * fd：软驱启动
 */
public enum BootDev {
    hd,
    cdrom,
    network,
    fd,
}
