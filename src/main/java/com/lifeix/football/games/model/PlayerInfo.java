package com.lifeix.football.games.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 列表页显示的球员信息
 * 
 * @author gcc
 */
@JsonInclude(Include.NON_EMPTY)
public class PlayerInfo {

    private String id = null;

    private String name = null;

    private String country = null;

    private String avatar = null;

    private Date birthday = null;

    private String birthplace = null;

    private Integer height = null;

    private Integer weight = null;

    private String position = null;

    /**
     * 1:首发 2：替补
     */
    private Integer first;

    /**
     * 国家队比赛数据统计
     */
    private PlayerNationalRecord record;

    private Integer jeserysNum;

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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public PlayerNationalRecord getRecord() {
        return record;
    }

    public void setRecord(PlayerNationalRecord record) {
        this.record = record;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getFirst() {
        return first;
    }

    public void setFirst(Integer first) {
        this.first = first;
    }

    public Integer getJeserysNum() {
        return jeserysNum;
    }

    public void setJeserysNum(Integer jeserysNum) {
        this.jeserysNum = jeserysNum;
    }

}
