package com.example.java8.day5;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class dateClass {

    public static void main(String[] args) throws InterruptedException {
       /*
        set time을 이용해서 시간을 제어할 수 있는 여건이 생김
        이것이 의미 하는것은 두개의 스레드가 있는 경우
        Date date = new Date();

        Long time = date.getTime();
        System.out.println(date);
        System.out.println(time);

        Thread.sleep(1000*3);
        Date after3Second = new Date();
        System.out.println(after3Second);
        after3Second.setTime(time);
        System.out.println(after3Second);*/

        /*
        Calendar calendar = new GregorianCalendar(1993, 7, 15);
        Calendar calendar1 = new GregorianCalendar(1993, calendar.JULY, 15);
        System.out.println(calendar.getTime());
        System.out.println(calendar1.getTime());*/

        //immutable
        Calendar calendar = new GregorianCalendar(1993,Calendar.SEPTEMBER,26);
        System.out.println(calendar.getTime());
        calendar.add(Calendar.DAY_OF_MONTH,1);
        System.out.println(calendar.getTime());

    }
}
