package com.java.web2.domain;

import java.text.SimpleDateFormat;

public class Member {

    private Long id;
    private String name;
    private String time;
    private String title;
    private String contents;
    private String orderNumber;


    SimpleDateFormat format = new SimpleDateFormat( "yy-MM-dd"); // \nHH:mm" // 시간

    public String getTime() {
        //format.format(System.currentTimeMillis());
        //LocalDateTime.now().format(DateTimeFormatter.ofPattern("yy-MM-dd\nHH:mm:ss"));
        String time = format.format(System.currentTimeMillis());
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

}
