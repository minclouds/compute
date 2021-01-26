package com.jwcloud.pod;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Pod标签
 *
 * 一个POD智能是相同的硬件环境及只有一套存储
 * 命名方式（{产品}.{描述}.{计算类型}_{存储类型}）
 * 例1：弹性云主机POD区：ecs.g1.com 一代通用计算区
 */
@AllArgsConstructor
public enum PodTag {
    EcsG1Com_EMC("ecs.g1.com_emc"),
    EcsG1Com_LVM("ecs.g1.com_lvm"),
    EcsG1Gpu("ecs.g1.gpu"),
    EcsG1Ghz("ecs.g1.ghz"),

    EbsEmcSSD("ebs.highio.ssd"),
    EbsEmcHDD("ebs.hybrid.hdd"),

    EcsG2Common("ecs.g2.common"),
    ;

    @Getter
    private final String tag;

}
