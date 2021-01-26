package com.jwcloud.host.client.kvm;

import lombok.Data;

@Data
public class KvmInfo {
    /* 虚拟机名称 */
    private String name;
    /* CPU的数量 */
    private int cpu;
    /* 虚拟机能使用的最大内存，单位KiB */
    private int memory;
    /* 虚拟机运行状态 */
    private String status;
    /* 虚拟机运行端口 */
    private int port;
}
