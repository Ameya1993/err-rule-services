package com.err.rule.model;

import java.util.List;

public class Rule {

    private List<ConditionGroup> groups;

    private String operator;

    public List<ConditionGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<ConditionGroup> groups) {
        this.groups = groups;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }


}
