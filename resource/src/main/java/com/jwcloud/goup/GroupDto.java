package com.jwcloud.goup;

import com.jwcloud.base.BaseDto;
import com.jwcloud.base.BaseState;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Api("Pod区")
@EqualsAndHashCode(callSuper = true)
@Data
public class GroupDto extends BaseDto {
    @ApiModelProperty(value = "唯一标识", example = "emc-com")
    private String uuid;
    @ApiModelProperty(value = "名称", example = "emc存储与普通规格云主机标签组")
    private String Name;
    @ApiModelProperty(value = "磁盘规格标签", example = "emc")
    private String ebsFlavorTag;
    @ApiModelProperty(value = "主机规格标签", example = "com")
    private String ecsFlavorTag;
    @ApiModelProperty(value = "描述", example = "emc存储与普通规格云主机标签组")
    private String description;
    @ApiModelProperty(value = "状态", example = "available")
    private BaseState state;
}
