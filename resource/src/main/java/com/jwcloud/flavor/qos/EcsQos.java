package com.jwcloud.flavor.qos;

import com.jwcloud.host.HostDeviceType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@ApiModel("云主机规格限制")
@Data
public class EcsQos {
    @ApiModelProperty(value = "CPU个数", example = "1")
    private int cpu;
    @ApiModelProperty(value = "内存大小（单位GiB）", example = "4")
    private float memory;
    @ApiModelProperty("硬件设备")
    private List<DeviceQos> devices;
    @ApiModelProperty("单网卡")
    private NicQos nicQos;
    @ApiModelProperty("整机磁盘")
    private DiskQos diskQos;

    @ApiModel("硬件设备限制")
    @Data
    public static class DeviceQos {
        @ApiModelProperty(value = "类型", example = "gpu")
        private HostDeviceType type;
        @ApiModelProperty(value = "型号", example = "T4")
        private String model;
        @ApiModelProperty(value = "容量或个数", example = "2")
        private int size;
    }

    @ApiModel("网卡限速QOS")
    @Data
    public static class NicQos {
        @ApiModelProperty(value = "网络入流量（单位Gbit/s）")
        private Qos inbound;
        @ApiModelProperty(value = "网络出流量（单位Gbit/s）")
        private Qos outbound;

        @Data
        public static class Qos {
            @ApiModelProperty(value = "平均值", example = "0.8")
            private float average;
            @ApiModelProperty(value = "突发值", example = "1.2")
            private float burst;
            @ApiModelProperty(value = "峰值", example = "4.0")
            private float peak;
        }
    }

    @ApiModel("磁盘限速QOS")
    @Data
    public static class DiskQos {
        @ApiModelProperty(value = "每秒的读写次数，单位（万）", example = "0.8")
        private float iops;
        @ApiModelProperty(value = "每秒的读写带宽，单位（Gbit/s）", example = "0.3")
        private float bps;
    }
}
