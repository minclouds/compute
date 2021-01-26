package com.jwcloud.host.client.kvm;

import com.jwcloud.flavor.qos.EcsQos;
import com.jwcloud.host.client.constant.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 服务器数据模型
 */
@NoArgsConstructor
@Data
public class KvmData {
    /* 虚拟机名称 */
    private String name;
    /* CPU的数量 */
    private int cpu;
    /* 虚拟机能使用的最大内存，单位KiB */
    private int memory;
    /* 虚拟机能使用的最大内存，单位 */
    private CpuMode cpuMode;
    /* 系统引导设备配置 */
    private OS os;
    /* 系统引导设备配置 */
    private List<DiskData> disks;
    /* 硬盘配置，需要手动修改，可以通过复制本段来创建新的磁盘 */
    private List<InterfaceData> interfaces;

    @NoArgsConstructor
    @Data
    public static class OS {
        /* 默认为x86架构 64位操作系统*/
        private Arch arch = Arch.x86_64;
        /* 默认硬盘启动 */
        private BootDev bootDev = BootDev.hd;
        /* 系统类型 */
        private OsType type;
        /* 注入主机名称 */
        private String servername;
        /* 密钥对 */
        private Keypair keypair;
        /* 登录用户名 */
        private String username;
        /* 登录密码 */
        private String password;
        /* 环境变量 */
        private Map<String,String> env;
        /* 启动运行脚本 */
        private String userData;

        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        public static class Keypair {
            /* 密钥名称 */
            private String name;
            /* 算法生成的公钥数据 */
            private String publicKey;
        }
    }

    /**
     * 磁盘数据模型
     */
    @NoArgsConstructor
    @Data
    public class DiskData {
        /* 磁盘唯一名称 */
        private String name;
        /* 磁盘大小 */
        private int capacity;
        /* 磁盘路径 */
        private String sourceFile;
        /* 磁盘盘符 */
        private String targetDev;
        /* 磁盘驱动类型 默认virtio */
        private DiskTargetBus bus;
        /* 磁盘驱动类型 */
        private DiskDriverType driverType;
        /* 磁盘限速 整机 */
        private EcsQos.DiskQos qos;
        /* pg，vg */
        private String groupName;
    }

    @NoArgsConstructor
    @Data
    public class InterfaceData {
        /* 网卡MAC地址，可删除 */
        private String macAddress;
        /* 指定网卡连接的交换机，默认bridge名称 */
        private String source;
        /* 子接口名称 */
        private String target;
        /* vlan号 */
        private int vlan;
        /* ip地址 */
        private String ipAddress;
        /* ip版本 */
        private IpVersion ipVersion;
        /* 网关 */
        private String gateway;
        /* 掩码 */
        private String netmask;
        /* 单网卡限速 */
        private EcsQos.NicQos qos;

    }
}
