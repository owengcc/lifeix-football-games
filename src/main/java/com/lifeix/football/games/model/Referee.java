package com.lifeix.football.games.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 裁判
 * 
 * @author gcc
 */
@JsonInclude(Include.NON_EMPTY)
public class Referee {
    private String id = null;

    private String name = null;

    private String sex = null;

    private String avatar = null;

    private String country = null;

    private Date birthday;

    private String birthplace = null;

    /**
     * 裁判级别
     */
    private String level = null;

    /**
     * 顶级联赛执法次数
     */
    private Integer showNum = null;

    /**
     * 职能，主裁判、助理裁判
     */
    private String function = null;

    /**
     * 比赛场上职能，主裁判，边裁，第四官员
     */
    private String position = null;

    /**
     * 11人制，5人制，沙滩
     */
    private String category = null;

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getShowNum() {
        return showNum;
    }

    public void setShowNum(Integer showNum) {
        this.showNum = showNum;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}
