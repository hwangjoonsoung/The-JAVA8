package com.example.java8.day2;

public interface Bar extends methodtype{

    default String printNameUpperCase() {
        return getName().toUpperCase();
    }

}
