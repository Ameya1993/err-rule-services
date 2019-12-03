package com.err.rule.model;

public class Condition {

    private Fact leftFact;

    private Fact rightFact;

    private Comparator comparator;

    private boolean hasConnectedCondition;


    public boolean gethasConnectedCondition() {
        return hasConnectedCondition;
    }

    public void sethasConnectedCondition(boolean hasConnectedCondition) {
        this.hasConnectedCondition = hasConnectedCondition;
    }

    public Fact getLeftFact() {
        return leftFact;
    }

    public void setLeftFact(Fact leftFact) {
        this.leftFact = leftFact;
    }

    public Fact getRightFact() {
        return rightFact;
    }

    public void setRightFact(Fact rightFact) {
        this.rightFact = rightFact;
    }

    public Comparator getComparator() {
        return comparator;
    }

    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }

}
