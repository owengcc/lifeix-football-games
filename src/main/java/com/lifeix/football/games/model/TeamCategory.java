package com.lifeix.football.games.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * 球队的分类
 * 
 * @author gcc
 */
@JsonInclude(Include.NON_EMPTY)
public class TeamCategory {

    private Long id = null;

    private String name = null;

    private Long fId = null;

    private Integer isLeaf = null;

    private List<TeamCategory> categories = new ArrayList<TeamCategory>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getfId() {
        return fId;
    }

    public void setfId(Long fId) {
        this.fId = fId;
    }

    public Integer getIsLeaf() {
        return isLeaf;
    }

    public void setIsLeaf(Integer isLeaf) {
        this.isLeaf = isLeaf;
    }

    public List<TeamCategory> getCategories() {
        return categories;
    }

    public void setCategories(List<TeamCategory> categories) {
        this.categories = categories;
    }

}
