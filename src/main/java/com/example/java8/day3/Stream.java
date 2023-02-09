package com.example.java8.day3;

import javax.naming.NamingEnumeration;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

    //데이터를 변경하지 않는다
    //스트림으로 처리하는 데이터는 오직 한번만 처리한다.
    //short circuti을 이용해서 제한할 수 있다 -> 무제한일수 있다.
    //중개 오퍼레이션은 lazy하다 -> return은 stream리턴한다.
    //종료 오퍼레이션은 lazy하다 -> return은 stream이 아닌 다른 타입을 리턴한다.

    public static void main(String[] args) {

        List<String> names = List.of("kim" , "hwang" , "park"  , "lee");

        //출력이 안된다. 그 이유는 다음과 같다.
        //중개형 오퍼레이터는 종료 오퍼레이터가 필수이다.
//        List<String> collect = names.stream().map(s -> {
//            System.out.println(s);
//            return s.toUpperCase();
//        }).collect(Collectors.toList());
//
//        System.out.println("==================");
//        collect.forEach(System.out::println);
//        System.out.println("==================");
//
//        names.forEach(System.out::println);

        //stream을 병렬적으로 처리하는 방법
//        names.parallelStream() 뒤에 오는 는 중계 오퍼레이터가 결국엔 병렬적으로 처리가 된다.

        //하나의 스레드에서 동기로 돌아감
//        List<String> collect = names.parallelStream().map(s ->
//                s.toUpperCase()).collect(Collectors.toList());
//
//        collect.forEach(System.out::println);
//        System.out.println("========================");
        //스레드가 다름 -> 느려질 수 도 있음
//        List<String> collect2 = names.parallelStream().map(s ->{
//                System.out.println(s+" : " + Thread.currentThread().getName()); return s.toUpperCase();}).collect(Collectors.toList());
//
//        collect2.forEach(System.out::println);
        names.parallelStream().map(s -> s.toUpperCase() ).forEach(s -> System.out.println(s+Thread.currentThread().getName()));
    }


}
