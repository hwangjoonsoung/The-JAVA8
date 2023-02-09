package com.example.java8.day6;

import java.util.concurrent.*;


public class Excutors {

    public static void main(String[] args) {

//        ExecutorService executorService = Executors.newSingleThreadExecutor();
////        //case 1
//        executorService.execute(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("thread1 : " + Thread.currentThread().getName() ) ;
//                try {
//                    Thread.sleep(3000L);
//                    System.out.println("thread1 end");
//                } catch (InterruptedException e) {
//                    System.out.println("thread1");
//                    throw new RuntimeException(e);
//                }
//
//            }
//        });
//
//        //case 2
//        executorService.submit(() -> {
//                System.out.println("thread2 : " + Thread.currentThread().getName() ) ;
//            try {
//                Thread.sleep(3000L);
//                System.out.println("thread2 end");
//            } catch (InterruptedException e) {
//                    System.out.println("thread2");
//                throw new RuntimeException(e);
//            }
//        });

//        executorService.shutdown(); //graceful shutdown : 작업을 마치고 끝낸다.
//        executorService.shutdownNow(); //바로 thread를 종료한다. (이거 바로 종료되는 이유가?)

        //thread가 2개인 excutorservice
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        executorService.submit(getRunable("test "));
//        executorService.submit(getRunable("test2 "));
//        executorService.submit(getRunable("test3 "));
//        executorService.submit(getRunable("test4 "));
//        executorService.submit(getRunable("test5 "));
//
//        executorService.shutdown();

        //scheduledexecuted
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(getRunable("hello"),1,2, TimeUnit.SECONDS);
//        scheduledExecutorService.schedule(getRunable("test1"),2,TimeUnit.SECONDS);
        scheduledExecutorService.shutdownNow();


    }





    private static  Runnable getRunable(String name){
        return () -> {System.out.println(name + Thread.currentThread().getName());
        };
    }


}
