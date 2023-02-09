package com.example.java8.day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1, "spring boot", true));
        springClasses.add(new OnlineClass(5, "rest api development", false));

        Optional<OnlineClass> spring = springClasses.stream().filter(onlineClass -> onlineClass.getTitle().startsWith("spring")).findFirst();
        System.out.println(spring.isPresent()); // true
        System.out.println(spring.isEmpty()); // false

        System.out.println(spring.get().getTitle()); //get()은 값을 가져오는 method

        //근데 여기서 값이 없으면? NoSuchElementException을 던진다.
        Optional<OnlineClass> spring2 = springClasses.stream().filter(onlineClass -> onlineClass.getTitle().startsWith("test")).findFirst();
//        System.out.println(spring2.get()); //exception을 던짐

        //get을 사용하는 것이 아닌 다양한 방법으로 사용하는 방법이 있다.
        spring.ifPresent(onlineClass -> System.out.println(onlineClass.getTitle()));

        //orElse()는 무적권 실행이 된다.
       OnlineClass onlineClass =  spring2.orElse((createNewClass()));
        System.out.println(onlineClass.getTitle());

        //orElseGet을 사용하면 없는경우만 지정할 수 있다.
        OnlineClass onlineClass1 = spring2.orElseGet(() -> createNewClass());
        OnlineClass onlineClass2 = spring.orElseGet(() -> createNewClass());
        System.out.println("없으면 : " + onlineClass1.getTitle()); // 없으면 만든 값을 가져옴
        System.out.println("있으면 : " + onlineClass2.getTitle()); // 있는 값을 가져옴

        //orElseThrow를 이용해서 exception을 던질 수 있다.
//        OnlineClass onlineClass3 = spring2.orElseThrow(() -> {return new IllegalStateException();});

        //값이 있는 경우 optional이 가지고 있는 함수를 사용할 수 있다.
        Optional<OnlineClass> onlineClass4 = spring.filter(onlineClass5 -> onlineClass5.getId() > 0);
        Stream<Object> onlineClass5 = spring.stream().map(oc ->oc.getTitle().toUpperCase());
        System.out.println(onlineClass4.get().getTitle());
        onlineClass5.forEach(o -> System.out.println(o));

        //만약 optional안에 optional이 있는 경우 flatMap()을 이용하면 된다.



    }

    public static OnlineClass createNewClass() {
        System.out.println("createNewClass");
        return new OnlineClass(10, " test" , false);
    }

}
