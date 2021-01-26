package com.jwcloud.cluster;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.jwcloud.base.BaseEntity;
import com.jwcloud.base.BaseState;
import com.jwcloud.pod.PodEntity;
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
@TableName("tbl_cluster")
public class ClusterEntity extends BaseEntity {
    /** 集群标识 */
    private String clusterUuid;
    /** 集群英文名称 */
    private String enName;
    /** 集群中文名称 */
    private String cnName;
    /** 描述 */
    private String description;
    /** 集群状态 */
    private BaseState state;
    @TableField(exist = false)
    private List<PodEntity> pods;

    public ClusterEntity(ClusterDto dto) {
        this.clusterUuid = dto.getUuid();
        this.enName = dto.getEnName();
        this.cnName = dto.getCnName();
        this.description = dto.getDescription();
        this.state = dto.getState();
    }
}
