package com.lifeix.football.games.module.competition.po;

public class CompetitionCategoryPO {
    private Long id = null;

    private String name = null;

    /**
     * 赛事标志
     */
    private String flag = null;

    /**
     * 赛事规则
     */
    private String rule = null;

    /**
     * 赛事类型 类别 0：双循环比赛 1：淘汰赛 2：小组赛+主客场淘汰赛 3：小组赛+单场淘汰赛 4：小组赛+单场淘汰赛+主客场淘汰赛
     */
    private Integer type = null;

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

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

}
