package com.jwcloud.constant;

/**
 * 弹性云服务器操作
 * create: 创建    unknown-->ready
 * delete：删除    ready-->deleted
 * attach：挂载    ready-->attached
 * detach：卸载    attached-->ready
 *
 *  ---不涉及状态变更
 * resize：扩容
 * changeName：修改显示名称
 */
public enum EbsAction {
    create,
    delete,
    attach,
    detach,
    resize,
    changeName,
}
