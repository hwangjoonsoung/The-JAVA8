package com.example.java8.day1;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {

    public static void main(String[] args) {
        Greeting greeting = new Greeting();

        UnaryOperator<String> stringUnaryOperator  = Greeting::hi;
//        UnaryOperator<String> stringUnaryOperator2  = greeting::hello;

        System.out.println(stringUnaryOperator.apply("test"));
//        System.out.println(stringUnaryOperator2.apply("test2"));


        Supplier<Greeting> greetingSupplier = Greeting::new;
        System.out.println("파라미터가 없는 : "+greetingSupplier.get());

        Function<String , Greeting> function = Greeting::new;
        System.out.println("파라미터가 있는 : "+function.apply("test"));
        System.out.println(function.apply("test").getName());

        String [] names = {"joonsoung" , "whiteship" , "toby"};

//        Arrays.sort(names, String::compareToIgnoreCase); // 임의의 객체에 참조
//        System.out.println(Arrays.toString(names));
//
//        Greeting greeting1 = new Greeting();
//        greeting1.hello("test");
//        Greeting.hi("test");
//
//        Greeting greeting2 = new Greeting();
//        UnaryOperator<String> te1 = Greeting::hi;
//        UnaryOperator<String> te2 = greeting2::hello;
//        te1.apply("test");
//        te2.apply("test");
        System.out.println("=================");
        Supplier<Greeting> stringSupplier = Greeting::new; //이 부분에서 Greeting(){}
        Greeting test = new Greeting("test");
        Function<String, Greeting> greetingUnaryOperator = Greeting::new;
        System.out.println("test111 : "+stringSupplier.get());
        System.out.println("testz : "+greetingUnaryOperator.apply("test").getName());
        System.out.println("=======");
        Function<String , Greeting> function1= Greeting::new;
        String a =  function1.apply("test---").hello();
        System.out.println(a);
    }

}
