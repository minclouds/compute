package com.jwcloud.host;

/**
 * 主机虚拟机化类型
 *
 * kvm：安装libvirt、qemu等开通虚拟机。
 * pxe：安装tftp、nfs、交换机部署dhcp等开通裸金属。
 * emc：scaleio虚拟机化
 */
public enum HostType {
    kvm,
    pxe,
    emc,
}
