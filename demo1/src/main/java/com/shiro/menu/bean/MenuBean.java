package com.shiro.menu.bean;

import java.util.List;

public class MenuBean {
    private Integer id;

    private Integer pid;

    private List<MenuBean> chid;

    private String name;

    private String path;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public List<MenuBean> getChid() {
        return chid;
    }

    public void setChid(List<MenuBean> chid) {
        this.chid = chid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }


}
