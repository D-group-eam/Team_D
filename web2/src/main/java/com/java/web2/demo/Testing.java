package com.java.web2.demo;

import java.text.SimpleDateFormat;


/**
 * 현재시간 TEST
 * */

public class Testing {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat( "yy-MM-dd\nHH:mm:ss");

        String time1 = format.format(System.currentTimeMillis());

//        System.out.println(time1);
    }
}
