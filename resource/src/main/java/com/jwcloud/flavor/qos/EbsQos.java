package com.jwcloud.flavor.qos;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("块存储规格限制")
@Data
public class EbsQos {
    @ApiModelProperty(value = "每秒的读写次数", example = "min(最大值，最小值 + 基础倍数 * 容量)")
    private Qos iops;
    @ApiModelProperty(value = "每秒的读写带宽", example = "min(最大值，最小值 + 基础倍数 * 容量)")
    private Qos bps;

    @ApiModel("块存储限速QOS")
    @Data
    public static class Qos {
        @ApiModelProperty(value = "最大值", example = "2000")
        private float max;
        @ApiModelProperty(value = "最小值", example = "200")
        private float min;
        @ApiModelProperty(value = "基础倍数", example = "4.0")
        private float base;
    }

}
