package com.example.java8.day3;

public class OnlineClass {

    private Integer id;
    private String title;
    private boolean close;

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
}
