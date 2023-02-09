package com.example.java8.day5;

import java.net.SocketTimeoutException;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateApi {
    public static void main(String[] args) {
//        //기계용
//        Instant instant = Instant.now();
//        System.out.println(instant); //기준시 GMT 2023-01-30T13:48:15.763476600Z
//        System.out.println(instant.atZone(ZoneId.of("Asia/Seoul"))); //2023-01-30T22:48:15.763476600+09:00[Asia/Seoul]
//        ZoneId zoneId = ZoneId.systemDefault();
//        System.out.println(zoneId); //Asia/Seoul
//        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
//        System.out.println(zonedDateTime); //2023-01-30T22:48:15.763476600+09:00[Asia/Seoul]
//
//        //duration
//        Instant instant1 = Instant.now();
//        Instant instant2 = instant1.plus(10 , ChronoUnit.SECONDS);
//        Duration duration = Duration.between(instant1,instant2);
//        System.out.println(duration.getSeconds()); //10
//
//
//        System.out.println("------------------------");
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime); //2023-01-30T22:48:15.784476200
//        //시간 만들기
//        LocalDateTime localDateTime1 = LocalDateTime.of(1993 , Month.SEPTEMBER , 26 , 10,2,30);
//        System.out.println(localDateTime1); //1993-09-26T10:02:30
//        //특정 지역 시간보기
//        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("America/Chicago"));
//        System.out.println(zonedDateTime1); //2023-01-30T07:53:53.993405100-06:00[America/Chicago]
        //기간 period
        LocalDate day1 = LocalDate.now();
        LocalDate day2 = LocalDate.of(1993 , Month.SEPTEMBER , 26);
        Period period = Period.between(day1 , day2);
        System.out.println(period.getYears()); //-29

        Period period1 = day1.until(day2);
        System.out.println(period1.getYears()); //-29

        System.out.println(day1);
        System.out.println(day2);
//
//        //format 지정
//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//        System.out.println(day1.format(dateTimeFormatter)); //01/30/2023
//
//        //지정한 format 변경
//        LocalDate parse = LocalDate.parse("01/30/2023", dateTimeFormatter);
//        System.out.println(parse); //2023-01-30
//
//        //instant를 date로 변경
//        Date date = new Date();
//        Instant instant3 = date.toInstant(); //date를 instant로
//        Date newDate = Date.from(instant3); //instant를 date로
//
//        GregorianCalendar calendar = new GregorianCalendar();
//        LocalDateTime dateTime = calendar.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
//
//        ZoneId zoneId2 = TimeZone.getTimeZone("PST").toZoneId();
//        TimeZone zone = TimeZone.getTimeZone(zoneId2);
//
//        System.out.println(zoneId2); //America/Los_Angeles
//        System.out.println(zone);
    }
}
