package com.example.java8.day1;

import java.util.function.UnaryOperator;

public class test {

    public static void main(String[] args) {

        Greeting greeting = new Greeting();
        greeting.hello("test");
        Greeting.hi("test");

        Greeting greeting2 = new Greeting();
        UnaryOperator<String> te1 = Greeting::hi;
        UnaryOperator<String> te2 = greeting2::hello;
        te1.apply("test");
        te2.apply("test");



    }


}
