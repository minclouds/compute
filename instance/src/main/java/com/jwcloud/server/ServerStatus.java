package com.jwcloud.server;
/**
 * 磁盘状态
 * unknown：尚未创建 unknown-->running
 * running：运行中 shutdown-->running
 * shutdown: 已关机
 * paused：已挂起
 * abnormal：异常
 * deleted：已删除
 */
public enum ServerStatus {
    unknown,
    running,
    shutdown,
    paused,
    abnormal,
    deleted,
}
