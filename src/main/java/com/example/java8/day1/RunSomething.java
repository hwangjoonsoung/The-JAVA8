package com.example.java8.day1;

@FunctionalInterface //자바가 제공한다.
public interface RunSomething {
    //함수형 인터페이스
    //추상 메소드가 하나만 있으면 함수형 인터페이스다.
    //동시에 다른 메소드가 있는건 상관이 없다.

    int doIt(int number, int a);

//    void test2();
//    두개 이상있으면 error난다.

    //인터페이스 안에 static 메소드를 정의할 수 있다
    public static void printName(){
        System.out.println("tes");
    }

    //default method를 정의 할 수 있다
    default void test(){
        System.out.println("test2");
    }
}
