package com.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateDemo {
    static void utilize(){
        Date date1 = new Date();
        Date date2 = new Date(0L);
        System.out.println(date1+" : "+date2);
        long msec = date1.getTime();
        System.out.println(msec+" - "+(date2.getTime()-date1.getTime()));
        DateFormat df = DateFormat.getDateInstance();
        System.out.println(df.format(date1));
        DateFormat df1 = DateFormat.getTimeInstance(DateFormat.FULL, Locale.UK);
        System.out.println(df1.format(date2));
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a zzzz");
        System.out.println(sdf.format(date1));
    }
}
