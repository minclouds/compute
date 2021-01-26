package com.jwcloud.nic;

import com.jwcloud.base.BaseEntity;
import com.jwcloud.constant.Constant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class NicEntity extends BaseEntity implements Constant {

    private String nicUuid;

    private String nicName;

    private String address;

    private String version;

    private String mac;

    private String gateway;

    private String netmask;

    private String tapName;

    private String type;

    private int vlan;

    private List<String> dns;

    private NicStatus status;

    private String state;

    private String userId;

    private String subnetId;

    private String serverId;

    public NicEntity(String userId, String instanceId, NicDto nicDto) {
        this.nicUuid = instanceId;
        this.nicName = nicDto.getInstanceName();
        this.address = nicDto.getAddress();
        this.version = nicDto.getVersion();
        this.mac = nicDto.getMac();
        this.gateway = nicDto.getGateway();
        this.netmask = nicDto.getNetmask();
        this.type = nicDto.getType();
        this.vlan = nicDto.getVlan();
        this.dns = nicDto.getDns();
        this.subnetId = nicDto.getSubnetId();
        this.userId = userId;
        this.setState(CREATING);
    }
}
