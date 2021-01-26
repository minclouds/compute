package com.jwcloud.disk;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel("块存储属性")
@NoArgsConstructor
@Data
public class DiskDto {
    @ApiModelProperty(value = "规格")
    private String instanceCode;
    @ApiModelProperty(value = "显示名称")
    private String instanceName;
    @ApiModelProperty(value = "容量")
    private int capacity;
    @ApiModelProperty(value = "快照")
    private String snapshotId;
    @ApiModelProperty(value = "镜像")
    private String imageId;

    @ApiModel("块存储容量")
    @Data
    public static class Capacity{
        @ApiModelProperty(value = "容量")
        private int size;
    }
}
