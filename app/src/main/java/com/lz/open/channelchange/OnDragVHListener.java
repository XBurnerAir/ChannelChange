package com.lz.open.channelchange;

/**
 * Author:  XBurnerAir
 * Email:   731228512@qq.com | zhiluoair@163.com
 * Date:    16/6/29.
 * Description:
 * ViewHolder 被选中 以及 拖拽释放 触发监听器
 */

public interface OnDragVHListener {
    /**
     * Item被选中时触发
     */
    void onItemSelected();


    /**
     * Item在拖拽结束/滑动结束后触发
     */
    void onItemFinish();
}
