package com.example.java8.day3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SimpleTimeZone;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {

        public static void main(String[] args) {
            List<OnlineClass> springClass = new ArrayList<OnlineClass>();
            springClass.add(new OnlineClass(1 , "spring boot" , true));
            springClass.add(new OnlineClass(2 , "spring data jpa" , true));
            springClass.add(new OnlineClass(3 , "spring mvc" , false));
            springClass.add(new OnlineClass(4 , "spring core" , false));
            springClass.add(new OnlineClass(5 , "rest api development" , false));



            System.out.println("spring으로 시작하는 수업");
            springClass.stream().filter(onlineClass -> onlineClass.getTitle().startsWith("spring")).forEach(onlineClass -> System.out.println(onlineClass.getId()));

            System.out.println("clase 되지 않는 수업");
            springClass.stream().filter(Predicate.not(OnlineClass::isClose)).forEach(onlineClass -> System.out.println(onlineClass.getId()));

            System.out.println("수업 이름만 모아서 스트림 만들기 ");
            //여기서 datatype의 변화가 일어난다. onlineclass라는 data type에서 그 안에 있는 string만 출력하는 것으로 자동으로 string으로 변환해서 출력하게 된다
            springClass.stream().map(onlineClass -> onlineClass.getTitle()).forEach(s -> System.out.println(s));
            //상세하게 보려면 아래의 코드를 본다.
//        ArrayList<String> strings = (ArrayList<String>) springClass.stream().map(onlineClass -> onlineClass.getTitle()).collect(Collectors.toList());
//        System.out.println(strings);

            List<OnlineClass> javaClass = new ArrayList<OnlineClass>();
            javaClass.add(new OnlineClass(6,"The Java, Test" , true));
            javaClass.add(new OnlineClass(7,"The Java, Code manipulation" , true));
            javaClass.add(new OnlineClass(8,"The Java, 8 to 11" , false));

            List<List<OnlineClass>> opneClass = new ArrayList<>();
            opneClass.add(javaClass);
            opneClass.add(springClass);

            List<List<List<OnlineClass>>> allClass = new ArrayList<>();

            //컬렉션 안에 있는 컬렉션을 작업 할때는 flatmap으로 처리해야 한다
            System.out.println("두 수업목록에 들어있는 모든 수업 아이디 출력");
            opneClass.stream().flatMap(onlineClasses -> onlineClasses.stream().map(onlineClass -> onlineClass.getId())).forEach(integer -> System.out.println(integer));
            System.out.println("10부터 1 씩 증가하는 무제한 스트림 중에서 10개 빼고 최대 10개 까지만");
            Stream.iterate(10 , integer -> integer+1).skip(10).limit(10).forEach(integer -> System.out.println(integer));

            System.out.println("자바 수업중 test가 들어있는 수업이 있는지 확인");
            boolean test0 =  javaClass.stream().allMatch(te -> te.getTitle().contains("The Java, Test"));
            System.out.println(test0);
            int test = (int) javaClass.stream().filter(te -> te.getTitle().contains("Test")).count();
            boolean test2 = javaClass.stream().anyMatch(te -> te.getTitle().contains("Test"));
            System.out.println(test);
            System.out.println(test2);

            System.out.println("스프링 수업 중에서 spring이 들어간 것들만 모아서 list만들기");
            ArrayList<String> strings = (ArrayList<String>) springClass.stream().filter(onlineClass -> onlineClass.getTitle().contains("spring")).map(onlineClass -> onlineClass.getTitle()).collect(Collectors.toList());
            ArrayList<String> strings2 = (ArrayList<String>) springClass.stream().map(onlineClass -> onlineClass.getTitle()).filter(onlineClass -> onlineClass.contains("spring")).collect(Collectors.toList());
            System.out.println(strings);
            System.out.println(strings2);

    }
}
