package com.jwcloud.controller.contant;

/**
 * 弹性云服务器操作
 * create: 创建   unknown-->running
 *  -- 关机操作 --
 * delete：删除    shutdown-->deleted
 * rebuild：重装   shutdown-->running
 * startup：启动   shutdown-->running
 *  ---开机操作
 * shutdown：关闭  running-->shutdown
 * reset：重启    先软重启，10s后未重启后强制关机再开机   running-->running
 *  ---不涉及状态变更
 * changeName：修改显示名称
 * changePassword：修改登录密码
 * changeNetwork：修改网络配置
 */
public enum BmsAction {
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
    updateName,
    changePassword,
    changeNetwork,
}
