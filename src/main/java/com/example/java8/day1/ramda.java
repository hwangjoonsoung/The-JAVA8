package com.example.java8.day1;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ramda {
    public static void main(String[] args) {

        ramda ramda = new ramda();
        ramda.run();

    }

    private void run() {
        int tete = 10;

        IntConsumer intConsumer = (i) -> {
            System.out.println(i+tete);
        };
        intConsumer.accept(10);

        //localclass
        class LocalClass {
            int tete = 1;

            void printTete() {
                System.out.println(tete);
            }
        }

        //익명클래스
        Consumer<Integer> integerConsumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer tete) {
                System.out.println(tete);
            }
        };


    }

}
