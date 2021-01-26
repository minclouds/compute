package com.jwcloud.host.client.constant;

/**
 * 电源操作,操作前后状态。
 * start：开机 shutdown-->running
 * stop：关机 running-->shutdown
 * reboot：软重启 running-->running
 * reset：硬重启 running-->running
 * pause：挂起 running-->paused
 * resume：恢复 paused-->running
 */
public enum PowerAction {
    start,
    stop,
    reboot,
    reset,
    pause,
    resume
}
