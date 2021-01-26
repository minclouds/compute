package com.jwcloud.pod;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jwcloud.base.BaseEntity;
import com.jwcloud.base.BaseState;
import com.jwcloud.host.HostEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 集群信息
 */
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
@TableName("tbl_pod")
public class PodEntity extends BaseEntity {
    /** 标识 */
    private String podUuid;
    /** 名称 */
    private String podName;
    /** 标签 */
    private String tag;
    /** 超分 */
    private float overCommit;
    /** 描述 */
    private String description;
    /** 状态 */
    private BaseState state;
    /** 最大主机数量 */
    private int hostMax;
    /** 已添加主机数量 */
    private int hostCount;
    /** 集群Id */
    private int clusterId;
    @TableField(exist = false)
    private List<HostEntity> hosts;

    public PodEntity(PodDto dto, int clusterId) {
        this.podUuid = dto.getUuid();
        this.podName = dto.getName();
        this.tag = dto.getTag().getTag();
        this.overCommit = dto.getOverCommit();
        this.description = dto.getDescription();
        this.state = dto.getState();
        this.clusterId = clusterId;
    }
}
