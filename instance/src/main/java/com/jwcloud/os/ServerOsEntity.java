package com.jwcloud.os;

import com.baomidou.mybatisplus.annotation.TableField;
import com.jwcloud.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Map;

@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data
public class ServerOsEntity extends BaseEntity {
    /* 镜像ID */
    private String imageId;
    /* 默认硬盘启动 */
    private String bootDev;
    /* 注入主机名称 */
    private String servername;
    /* 密钥对 */
    private String keypairName;
    /* 登录用户名 */
    private String username;
    /* 登录密码 */
    private String password;
    /* 环境变量 */
    private Map<String,String> env;
    /* 主机Id */
    private String serverId;
    /* 启动运行脚本 */
    private String userData;
    /* 默认为x86架构 64位操作系统*/
    @TableField(exist = false)
    private String arch;
    /* 系统类型 */
    @TableField(exist = false)
    private String type;
    @TableField(exist = false)
    private String publicKey;

}
