package com.jwcloud.server;

import com.jwcloud.base.BaseDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@EqualsAndHashCode(callSuper = true)
@ApiModel("服务器实例属性")
@NoArgsConstructor
@Data
public class ServerDto extends BaseDto {
    @ApiModelProperty(value = "规格")
    private String instanceCode;
    @ApiModelProperty(value = "显示名称")
    private String instanceName;
    @ApiModelProperty(value = "服务标签")
    private String serviceType;
    @ApiModelProperty(value = "镜像模板")
    private String imageId;
    @ApiModelProperty(value = "登录密码")
    private String password;
    @ApiModelProperty(value = "登录密钥对")
    private String keypairName;
    @ApiModelProperty(value = "主机名称")
    private String hostName;
    @ApiModelProperty(value = "环境变量")
    private Map<String,String> env;
    @ApiModelProperty(value = "注入脚本")
    private String userData;
    @ApiModelProperty(value = "规格")
    private String systemDisk;
    @ApiModelProperty(value = "数据盘列表")
    private List<String> dataDisks;
    @ApiModelProperty(value = "网卡列表")
    private List<String> enis;

    @ApiModel("操作系统密码")
    @Data
    public static class Password {
        @ApiModelProperty(value = "登录密码")
        private String password;
        @ApiModelProperty(value = "登录密钥对")
        private String keypairName;
    }
}
