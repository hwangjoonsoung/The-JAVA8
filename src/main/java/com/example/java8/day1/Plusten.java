package com.example.java8.day1;

import java.util.function.Function;

public class Plusten implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer+10;
    }
}
