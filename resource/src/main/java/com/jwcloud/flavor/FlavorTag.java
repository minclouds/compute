package com.jwcloud.flavor;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 规格标签
 *
 * 一个POD只能是相同的硬件环境及只有一套存储
 * 命名方式（{产品}_{代数或厂商}_{类型}
 * 例1：弹性云主机POD区：ecs.g1.com 一代通用计算区
 */
public enum FlavorTag {
    ecs_g1_com,
    ecs_g1_gpu,

    ebs_emc_ssd,
    ;
}
