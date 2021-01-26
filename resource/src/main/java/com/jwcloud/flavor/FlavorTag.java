package com.jwcloud.flavor;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 标签组合
 *
 * 一个POD智能是相同的硬件环境及只有一套存储
 * 命名方式（{产品}.{描述}.{计算类型}
 * 例1：弹性云主机POD区：ecs.g1.com 一代通用计算区
 */
@AllArgsConstructor
public enum FlavorTag {
    EcsG1Com("ecs.g1.com"),
    EcsG1Gpu("ecs.g1.gpu"),
    EcsG1Ghz("ecs.g1.ghz"),

    EbsEmcSSD("ebs.emc_highio.ssd"),
    EbsEmcHDD("ebs.emc_hybrid.hdd"),

    EcsG2Common("ecs.g2.common"),
    ;

    @Getter
    private final String tag;

}
