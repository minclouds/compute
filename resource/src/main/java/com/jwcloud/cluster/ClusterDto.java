package com.jwcloud.cluster;

import com.jwcloud.base.BaseDto;
import com.jwcloud.base.BaseState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@ApiModel("集群")
@EqualsAndHashCode(callSuper = true)
@Data
public class ClusterDto extends BaseDto {
    @ApiModelProperty(value = "唯一标识", example = "HB2-beijing-a")
    private String uuid;
    @ApiModelProperty(value = "英文名称", example = "az1")
    private String enName;
    @ApiModelProperty(value = "中文名称", example = "可用区1")
    private String cnName;
    @ApiModelProperty(value = "描述", example = "华北2北京兆维机房")
    private String description;
    @ApiModelProperty(value = "状态", example = "available")
    private BaseState state;
}
