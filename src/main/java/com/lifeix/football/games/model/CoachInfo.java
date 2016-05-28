package com.lifeix.football.games.model;

import java.util.Date;

/**
 * 教练列表页显示信息
 * 
 * @author gcc
 */
public class CoachInfo {
    private String id = null;

    private String name = null;

    /**
     * 头像
     */
    private String avatar = null;

    private String level;

    /**
     * 生日
     */
    private Date birthday = null;

    /**
     * 出生地
     */
    private String birthplace = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

}
