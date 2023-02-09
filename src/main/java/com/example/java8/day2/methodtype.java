package com.example.java8.day2;

public interface methodtype{

    void printName();

    /*
    * @implSpec test
     * 이 구현체는 getName()으로 가져온 문자열을 대문자로 바꿔서 사용
    * */
    default String printNameUpperCase() {
        return getName().toUpperCase();
    }

    static void printAnything(){
        System.out.println("static test");
    }

    String getName();

//    default String toString();

}
