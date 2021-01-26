package com.jwcloud.nic;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@ApiModel("网卡属性")
@NoArgsConstructor
@Data
public class NicDto {
    @ApiModelProperty(value = "规格")
    private String instanceCode;
    @ApiModelProperty(value = "显示名称")
    private String instanceName;
    @ApiModelProperty(value = "IP地址")
    private String address;
    @ApiModelProperty(value = "IP版本")
    private String version;
    @ApiModelProperty(value = "MAC地址")
    private String mac;
    @ApiModelProperty(value = "网关")
    private String gateway;
    @ApiModelProperty(value = "掩码")
    private String netmask;
    @ApiModelProperty(value = "类型")
    private String type;
    @ApiModelProperty(value = "Vlan")
    private int vlan;
    @ApiModelProperty(value = "子网Id")
    private String subnetId;
    @ApiModelProperty(value = "DNS")
    private List<String> Dns;

    @ApiModel("IP属性")
    @NoArgsConstructor
    @Data
    public static class IPAddress{
        @ApiModelProperty(value = "IP地址")
        private String address;
        @ApiModelProperty(value = "IP版本")
        private String version;
    }
}
