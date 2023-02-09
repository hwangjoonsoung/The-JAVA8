package com.example.java8.day2;

public class app {

    public static void main(String[] args) {

        methodTypeImpl methodType = new methodTypeImpl("test");
        System.out.println(methodType.getName());
        System.out.println(methodType.printNameUpperCase());
        //methodimpl에는 실질적으로 printNameUpperCase가 없다. 근데 사용이 가능하다
        //단점은 excepotion을 대비해야한다는 점.

    }

}
