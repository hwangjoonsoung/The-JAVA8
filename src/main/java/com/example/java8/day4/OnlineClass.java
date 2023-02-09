package com.example.java8.day4;

import java.util.Optional;
import java.util.OptionalInt;

public class OnlineClass {

    private Integer id;
    private String title;
    private boolean close;
    public Progress progress;

    public OnlineClass(Integer id, String title, boolean close) {
        this.id = id;
        this.title = title;
        this.close = close;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isClose() {
        return close;
    }

    public void setClose(boolean close) {
        this.close = close;
    }

    //2. checkedexception을 던지면 에러처리를 강제하는 문제와 error가 찍히면 stacktrace를 찍는다.=> 성능저하
//    public Progress getProgress() {
//        if(this.progress == null){
//            throw new IllegalStateException();
//        }
//        return progress;
//    }

    //3. 이러한 일련의 문제를 해결하는 것이 optional이다.
    public Optional<Progress> getProgress() {
//        return Optional.of(progress); null불가
        return Optional.ofNullable(progress);
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }
    //4. 잘못사용하는 경우
//    잘못사용하는 case.1
//    실질적으로 가능흔 하지만 의미가 없다... null값이 들어가게 되면 null값으로 isPresent를 진행하는 것이기 때문이다.
//    이걸해결하기 위해서 또 다시 조건문으로 null check를 진행하는데 비효율적이다.
//    public void setProgress(Optional<Progress> progress) {
//        progress.ifPresent(p -> this.progress =p);
//    }

//    잘못사용하는 case.2
//    map에서 key를 null값으로 사용하는 경우

//    잘못사용하는 case.3
//    filed에서 datatype을 optional로 사용하는 경우
//    private Optional<Progress> progress;

    //5. 부득이하게 null을 리턴하는 경우
    public Optional<Progress> progress(){
        return Optional.empty();
    }


}
