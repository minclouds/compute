package com.jwcloud.host.client.constant;

import lombok.AllArgsConstructor;

/**
 * 虚拟机CPU配置模式
 * host-passthrough：直通模式
 * host-model：匹配模式
 * 兼容模式：兼容模式
 *
 * 三种mode的性能排序是：host-passthrough > host-model > custom
 * 三种mode的热迁移通用性是： custom > host-model > host-passthrough
 */
@AllArgsConstructor
public enum CpuMode {
    PASS("host-passthrough"),
    MARCH("host-model"),
    CUSTOM("custom");

    private final String mode;
}
