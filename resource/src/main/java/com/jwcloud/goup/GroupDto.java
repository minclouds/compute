package com.jwcloud.goup;

import com.jwcloud.base.BaseDto;
import com.jwcloud.base.BaseState;
import com.jwcloud.flavor.FlavorTag;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Api("标签组")
@EqualsAndHashCode(callSuper = true)
@Data
public class GroupDto extends BaseDto {
    @ApiModelProperty(value = "唯一标识", example = "emc-com")
    private String uuid;
    @ApiModelProperty(value = "名称", example = "通用主机与EMC全闪规格组")
    private String name;
    @ApiModelProperty(value = "主机规格标签", example = "ecs_g1_com")
    private FlavorTag ecsFlavorTag;
    @ApiModelProperty(value = "磁盘规格标签", example = "ebs_emc_ssd")
    private FlavorTag ebsFlavorTag;
    @ApiModelProperty(value = "描述", example = "emc存储与普通规格云主机标签组")
    private String description;
    @ApiModelProperty(value = "状态", example = "available")
    private BaseState state;
}
