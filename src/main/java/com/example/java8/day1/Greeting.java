package com.example.java8.day1;

public class Greeting {
    private  String name;

    public Greeting(String name) {
        this.name = name;
    }

    public Greeting(){
        System.out.println("testzzzz");
    }

    public String getName() {
        return name;
    }

    public String hello(String name){
        return "hello "+ name;
    }

    public static String hi(String name){
        return  "hi " + name;
    }

    public String hello() {
        return "hello "+ name;
    }
}