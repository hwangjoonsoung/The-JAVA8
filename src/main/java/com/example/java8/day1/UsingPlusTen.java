package com.example.java8.day1;

import java.util.function.*;

public class UsingPlusTen {

    public static void main(String[] args) {

        //----------------------function
        Plusten plusten = new Plusten();

        Function<Integer, Integer> plus10 = (a) -> {
            return a + 10;
        };

        Function<Integer, Integer> multi = (i) -> {
            return i * 2;
        };
        Function<Integer, Integer> te1 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return null;
            }
        };

        Function<Integer, Integer> test = (zzz) -> {
            return zzz + 10;
        };

        //함수의 조합 -> 하나의 트렌잭션으로 만들수도 있겠네?
        System.out.println("=========");
        Function<Integer, Integer> integerIntegerFunction = plus10.compose(multi);

        Function<Integer, Integer> integerIntegerFunction2 = plus10.andThen(multi);

        //----------------------byfunction
//
//        Function<Integer,Integer> te =
        BiFunction<String, Integer, String> biFunction = (a, b) -> {
            return a + b;
        };

        Function<Integer, Integer> functionInteInte = (inte) -> {
            return inte;
        };


        Function<Integer, Integer> functionPlus = (in) -> {
            return in + 10;
        };
        Function<Integer, Integer> functionMul = (in) -> {
            return in * 10;
        };

        Function<Integer , Integer> function1 = functionPlus.compose(functionMul);
        Function<Integer , Integer> function2 = functionPlus.andThen(functionMul);


        int test1 = functionPlus.compose(functionMul).apply(1);
        int test2 = functionPlus.andThen(functionMul).apply(1);
        System.out.println(test1);
        System.out.println(test2);

        Consumer<String> stringConsumer = (z1) -> {
            System.out.println(z1);
        };

        stringConsumer.accept("set");
        int a;
        Supplier<Integer> integerSupplier = new Supplier<Integer>() {

            @Override
            public Integer get() {
                int a =10;
                return a;
            }
        };

        System.out.println(integerSupplier.get());

        Predicate<Integer> integerPredicate =integer -> {
            return integer<10;
        };

        System.out.println(integerPredicate.test(1));

        UnaryOperator<Integer>  integerUnaryOperator = integer -> {
            return integer;
        };

        System.out.println("test"+integerUnaryOperator.apply(1));

        BinaryOperator<Integer> integerBinaryOperator = (integer, integer2) -> {
                return integer+integer2;
        };
        System.out.println("tes"+integerBinaryOperator.apply(10,20));
    }


}
