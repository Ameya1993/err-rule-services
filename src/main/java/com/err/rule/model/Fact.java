package com.err.rule.model;

public class Fact<T> {

    private String factName;

    private String dataType;

    private T constantValue;

    public String getFactName() {
        return factName;
    }

    public void setFactName(String factName) {
        this.factName = factName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public T getConstantValue() {
        return constantValue;
    }

    public void setConstantValue(T constantValue) {
        this.constantValue = constantValue;
    }
}
