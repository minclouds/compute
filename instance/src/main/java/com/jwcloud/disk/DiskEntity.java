package com.jwcloud.disk;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jwcloud.base.BaseEntity;
import com.jwcloud.constant.Constant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
@TableName("tbl_server_disk")
public class DiskEntity extends BaseEntity implements Constant {
    private String diskUuid;

    private String diskName;

    private String type;

    private String flavorId;

    private int capacity;

    private String target;

    private String path;

    private DiskStatus status;

    private String state;

    private String userId;

    private String serverId;

    private String hostId;

    public DiskEntity(String userId, String instanceId, String hostId, DiskDto diskDto) {
        this.diskUuid = instanceId;
        this.diskName = diskDto.getInstanceName();
        this.flavorId = diskDto.getInstanceCode();
        this.capacity = diskDto.getCapacity();
        this.hostId = hostId;
        this.status = DiskStatus.unknown;
        this.userId = userId;
        this.setState(CREATING);
    }
}
