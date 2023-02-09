package com.example.java8.day2;

import java.util.*;
import java.util.function.Predicate;

public class app2 {

    public static void main(String[] args) {

        List<String> name = new ArrayList<>();
        name.add("hwang");
        name.add("lee");
        name.add("park");
        name.add("kim");

        name.forEach(s -> System.out.println(s));

       System.out.println("-----------------spliterator 1회");
        Spliterator<String> spliterator = name.spliterator().trySplit();
        Spliterator<String> spliterator2 = spliterator.trySplit();

        while (spliterator.tryAdvance(System.out::println)) ;
        System.out.println("tttt");
        while (spliterator2.tryAdvance(System.out::println)) ;

        System.out.println("-----------------spliterator 2회");
        Spliterator<String> spliteratorfirst = name.spliterator().trySplit();
        Spliterator<String> spliteratorsecond = spliteratorfirst.trySplit();
        while (spliteratorfirst.tryAdvance(System.out::println)) ;
        System.out.println("===============");
        while (spliteratorsecond.tryAdvance(System.out::println)) ;


        int count = (int) name.stream().map(String::toUpperCase).filter(s -> s.startsWith("H")).count();
        System.out.println(count);

        name.stream().map(s -> s.toUpperCase()).filter(o -> ((String) o).startsWith("H"));

//        name.removeIf((Predicate<? super String>) name.stream().map(s -> s.toUpperCase()).filter(s -> s.startsWith("H")));
        System.out.println("name" + name);
        name.removeIf(s -> s.toUpperCase().startsWith("H"));
        System.out.println("name : "+name);


                name.removeIf(s -> s.startsWith("h"));
        System.out.println(name);

        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        name.sort(compareToIgnoreCase.reversed());
        System.out.println(name);

        Object []  test= name.toArray();
        Arrays.sort(test);
        System.out.println(Arrays.toString(test));
    }

}
