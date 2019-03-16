package com.utils;

import java.util.Date;

public class DateDemo {
    static void utilize(){
        Date date1 = new Date();
        Date date2 = new Date(0L);
        System.out.println(date1+" : "+date2);
        long msec = date1.getTime();
        System.out.println(msec+" - "+(date2.getTime()-date1.getTime()));
    }
}
