package com.jwcloud.goup;

import com.baomidou.mybatisplus.annotation.TableName;
import com.jwcloud.base.BaseEntity;
import com.jwcloud.base.BaseState;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 集群信息
 */
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
@TableName("tbl_pod")
public class GroupEntity extends BaseEntity {
    /** 标识 */
    private String groupUuid;
    /** 名称 */
    private String groupName;
    /** 磁盘规格标签 */
    private String ebsFlavorTag;
    /** 主机规格标签 */
    private String ecsFlavorTag;
    /** 描述 */
    private String description;
    /** 状态 */
    private BaseState state;

    public GroupEntity(GroupDto dto) {
        this.groupUuid = dto.getUuid();
        this.groupName = dto.getName();
        this.ebsFlavorTag = dto.getEbsFlavorTag();
        this.ecsFlavorTag = dto.getEcsFlavorTag();
        this.description = dto.getDescription();
        this.state = dto.getState();
    }
}
