package com.example.java8.day6;

public class Concurrent {

    public static void main(String[] args) throws InterruptedException {

//        멀티스레드를 만드는 방법
//        방법 1
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        System.out.println("Hello World");

//        방법 2-1 : thread에 runable 인스턴스화
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread :" + Thread.currentThread().getName());
//            }
//        });
//        thread.start();

//        방법 2-2 : runable with lamda
//            Thread thread = new Thread(() -> {
//                System.out.println("Thread :" + Thread.currentThread().getName());
//            });
//            thread.start();

//         thread sleep;
//        Thread thread = new Thread(() -> {
////            try {
////                Thread.sleep(1000L);
////            } catch (InterruptedException e) {
////                throw new RuntimeException(e);
////                //InterruptedException : thread가 sleep인데 awake를 하는 경우
////            }
////            System.out.println("Thread : " + Thread.currentThread().getName());
////        });
////        thread.start();

//       다른 스레드를 종료시키는 방법
//        Thread thread = new Thread(() -> {
//            while (true) {
//                System.out.println("thread : " + Thread.currentThread().getName());
//                try {
//                    Thread.sleep(1000L);
//                } catch (InterruptedException e) {
//                    System.out.println("exit");
//                    return;
//                }
//            }
//        });
//        thread.start();
//
//
//        System.out.println("Hello World : " + Thread.currentThread().getName());
//        Thread.sleep(3000L);
//        thread.interrupt();;

//        join 다른 스레드를 기다리는 방법
        Thread thread = new Thread(() -> {
            System.out.println("thread : " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000l);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        });
        thread.start();

        System.out.println("hello : " + Thread.currentThread().getName());
        thread.join();
        System.out.println(thread + " is finished");
    }

    //방법 1
//    static class MyThread extends Thread {
//        @Override
//        public void run() {
//            System.out.println("Thread : " + Thread.currentThread().getName());
//        }
//    }

}
