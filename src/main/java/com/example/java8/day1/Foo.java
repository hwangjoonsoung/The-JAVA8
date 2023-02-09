package com.example.java8.day1;

public class Foo{

    public static void main(String[] args) {
//        익명 내부 클레스
//        실행이 1 line 이상이면
//        RunSomething runSomething = () -> System.out.println("test1");
//        RunSomething runSomething2 = new RunSomething() {
//            @Override
//            public void doIt() {
//                System.out.println("test2");
//            }
//        };
//        runSomething2.doIt();
//        runSomething.doIt();
        int test11 = 10; //final으로 가정하고 사용한다
        RunSomething runSomething = (number,a) -> {
//            int test11 = 10;
            return number+a;
//                test11++;
        };

        //함수 안에서 함수 밖에 있는 값을 참조해서 사용하는데 그 참조하는 값을 변경하는 경우

        runSomething.test();
        RunSomething.printName();


//        싱행이 2 line 이상이면
//        RunSomething runSomething = () -> {
//            System.out.println("test");
//            System.out.println("testet");
//        };

    }


}
