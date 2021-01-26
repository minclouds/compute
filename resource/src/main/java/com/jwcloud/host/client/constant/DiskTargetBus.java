package com.jwcloud.host.client.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ovirt磁盘类型（IDE, virtio, virtio-scsi）
 * IDE：全虚拟化，性能较差，不支持在线热插拔。盘符/dev/hdx。单虚拟机最多支持3个IDE硬盘
 * virtio：半虚拟化，性能好，盘符/dev/vdx。
 * virtio-scsi：解决virtio限制，盘符/dev/sdx。
 */
@AllArgsConstructor
public enum DiskTargetBus {
    VIRTIO_SCSI("virtio-scsi"),
    VIRTIO("virtio"),
    IDE("IDE");

    @Getter
    private final String bus;
}
