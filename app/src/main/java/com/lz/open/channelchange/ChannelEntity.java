package com.lz.open.channelchange;

/**
 * Author:  XBurnerAir
 * Email:   731228512@qq.com | zhiluoair@163.com
 * Date:    16/6/29.
 * Description:
 * 频道实体类
 */
public class ChannelEntity {

    private long id;
    private String name;
    private boolean seclect;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSeclect() {
        return seclect;
    }

    public void setSeclect(boolean seclect) {
        this.seclect = seclect;
    }

    @Override
    public String toString() {
        return "ChannelEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", seclect=" + seclect +
                '}';
    }
}
