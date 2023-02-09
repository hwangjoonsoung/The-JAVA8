package com.example.java8.day2;

public class methodTypeImpl implements methodtype , Bar{

    String name;

    @Override
    public void printName() {
        System.out.println("test");
    }

    @Override
    public String getName() {
        return name;
    }

    public methodTypeImpl(String name) {
        this.name = name;
    }

    //재정의 가능
//    @Override
//    public String printNameUpperCase() {
//        return methodtype.super.printNameUpperCase();
//    }

    public static void main(String[] args) {
        methodtype.printAnything();
    }




}
