package com.err.rule.model;

import java.util.List;

public class ConditionGroup {

    private String groupName;

    private List<Condition> group;

    private String operator;

    private boolean hasConnectedConditionGroup;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public List<Condition> getGroup() {
        return group;
    }

    public void setGroup(List<Condition> group) {
        this.group = group;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public boolean isHasConnectedConditionGroup() {
        return hasConnectedConditionGroup;
    }

    public void setHasConnectedConditionGroup(boolean hasConnectedConditionGroup) {
        this.hasConnectedConditionGroup = hasConnectedConditionGroup;
    }

}
