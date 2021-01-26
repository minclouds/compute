package com.jwcloud.flavor;

import com.jwcloud.base.BaseDto;
import com.jwcloud.base.BaseState;
import com.jwcloud.flavor.qos.EcsQos;
import com.jwcloud.pod.PodTag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@ApiModel("实例规格")
@EqualsAndHashCode(callSuper = true)
@Data
public class EcsFlavorDto extends BaseDto {
    @ApiModelProperty(value = "唯一标识", example = "ecs.g1.large.4")
    private String uuid;
    @ApiModelProperty(value = "名称", example = "一代通用规格")
    private String name;
    @ApiModelProperty(value = "主机限速")
    private EcsQos qos;
    @ApiModelProperty(value = "标签", example = "EcsG1Com")
    private PodTag podTag;
    @ApiModelProperty(value = "状态", example = "available")
    private BaseState state;
}
