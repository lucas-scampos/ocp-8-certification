package com.certification.advanced_class_design;

public enum EnumSeason {

    WINTER("low"),
    SPRING(" medium"),
    SUMMER(" high"),
    FALL("medium");

    private String expectedVisitors;

    private EnumSeason(String expectedVisitors){
        this.expectedVisitors = expectedVisitors;
    }

    public static void main(String[] args) {
    }
}

