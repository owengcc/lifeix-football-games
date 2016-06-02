package com.lifeix.football.games.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 教练详情页显示的信息
 * 
 * @author gcc
 */
@JsonInclude(Include.NON_EMPTY)
public class Coach {
    private String id = null;

    private String name = null;

    /**
     * 头像
     */
    private String avatar = null;

    private String country = null;

    /**
     * 生日
     */
    private Date birthday = null;

    /**
     * 出生地
     */
    private String birthplace = null;

    private String level;

    private String position;

    private String introduce;

    /**
     * 教练生涯
     */
    private List<TeamInfo> career = new ArrayList<TeamInfo>();

    /**
     * 当前所在球队
     */
    private TeamInfo team = null;

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

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public List<TeamInfo> getCareer() {
        return career;
    }

    public void setCareer(List<TeamInfo> career) {
        this.career = career;
    }

    public TeamInfo getTeam() {
        return team;
    }

    public void setTeam(TeamInfo team) {
        this.team = team;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

}
