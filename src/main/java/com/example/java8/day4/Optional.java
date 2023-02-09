package com.example.java8.day4;

import org.springframework.objenesis.instantiator.basic.NullInstantiator;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class Optional {

    public static void main(String[] args) {

        List<OnlineClass> springClass = new ArrayList<>();
        springClass.add(new OnlineClass(1 , "spring boot" , true));
        springClass.add(new OnlineClass(2 , "spring data jpa" , true));
        springClass.add(new OnlineClass(3 , "spring mvc" , false));
        springClass.add(new OnlineClass(4 , "spring core" , false));
        springClass.add(new OnlineClass(5 , "rest api development" , false));

        OnlineClass spring_boot = new OnlineClass(1,"spring boot" , true);
//        Duration studyDuration = spring_boot.getProgress().getStudyDuration();
//        System.out.println(studyDuration); //1. null이기 때문에 출력불가능

        //1-1) 1d의 해결방법으로 이렇게 조건을 지정하여 해결한다.
        //문제는 해당 과정을 잊을 수 있다는 점과 null을 리턴하는것이 문제다.
//        Progress progress = spring_boot.getProgress();
//        if(progress!= null){
//            System.out.println(progress.getStudyDuration());
//        }

        OptionalInt.of(10);
        //6. 이렇게 primitive type은 optional이 제공하는 것을 사용한다. 그렇지 않는경우 박싱, 언박싱이 발생한다.
        //7. optional을 optional로 감싸지 말것
    }

}
