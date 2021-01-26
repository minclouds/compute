package com.jwcloud.constant;

/**
 * 弹性云服务器操作
 *
 * create: 创建   unknown-->running
 *  -- 关机操作 --
 * delete：删除    shutdown-->deleted
 * rebuild：重装操作系统   shutdown-->running
 * startup：启动   shutdown-->running
 *  ---开机操作
 * shutdown：关闭  running-->shutdown
 * reset：硬重启    先软重启，10s后未重启后强制关机再开机   running-->running
 * pause：挂起 running-->paused
 * resume：恢复 paused-->running
 *
 *  ---不涉及状态变更
 * resize：更改规格（核数或内存），同时会修改限速
 * changeName：修改显示名称
 * changePassword：修改登录密码
 * changeNetwork：修改网络配置
 */
public enum EcsAction {
    create,
    delete,
    rebuild,
    startup,
    shutdown,
    reboot,
    reset,
    pause,
    resume,
    resize,
    changeName,
    changePassword,
    changeNetwork,
}
