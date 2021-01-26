package com.jwcloud.pod;

import com.jwcloud.base.BaseDto;
import com.jwcloud.base.BaseState;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Api("Pod区")
@EqualsAndHashCode(callSuper = true)
@Data
public class PodDto extends BaseDto {
    @ApiModelProperty(value = "唯一标识", example = "HB2-beijing-cvk-com")
    private String uuid;
    @ApiModelProperty(value = "名称", example = "通用ECS交付区")
    private String Name;
    @ApiModelProperty(value = "能力标签", example = "EcsG1Com")
    private PodTag tag;
    @ApiModelProperty(value = "CPU超分", example = "4")
    private float overCommit;
    @ApiModelProperty(value = "描述", example = "北京牧野通用-计算-内存混合CVK调度区")
    private String description;
    @ApiModelProperty(value = "状态", example = "available")
    private BaseState state;
    @ApiModelProperty(value = "集群", example = "HB2-beijing-a")
    private String clusterId;
}
