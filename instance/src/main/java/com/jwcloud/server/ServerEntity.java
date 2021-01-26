package com.jwcloud.server;

import com.baomidou.mybatisplus.annotation.TableField;
import com.jwcloud.base.BaseEntity;
import com.jwcloud.constant.Constant;
import com.jwcloud.disk.DiskEntity;
import com.jwcloud.nic.NicEntity;
import com.jwcloud.os.ServerOsEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class ServerEntity extends BaseEntity implements Constant {
    private String serverUuid;

    private String name;

    private String type;

    private String flavorId;

    private String manageIp;

    private String managePort;

    private ServerStatus status;

    private String state;

    private String hostId;

    private String userId;
    @TableField(exist = false)
    private ServerOsEntity os;
    @TableField(exist = false)
    private List<DiskEntity> disks;
    @TableField(exist = false)
    private List<NicEntity> nics;

    public ServerEntity(String userId, String instanceId, String hostId, ServerDto serverDto) {
        this.serverUuid = instanceId;
        this.name = serverDto.getInstanceName();
        this.type = serverDto.getServiceType();
        this.flavorId = serverDto.getInstanceCode();
        this.status = ServerStatus.unknown;
        this.userId = userId;
        this.hostId = hostId;
        this.setState(CREATING);
    }
}
