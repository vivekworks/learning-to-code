package com.utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeAPI {
    static void utilize(){
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate+"\n"+localTime+"\n"+localDateTime);
        System.out.println(localDateTime.toLocalDate()+"\n"+localDateTime.toLocalTime());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.println(localDate.format(dateTimeFormatter));
        System.out.println(localTime.format(dateTimeFormatter1));
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd MMMM yyyy hh:mm:ss a EEEE");
        System.out.println(localDateTime.format(dtf1));
        String time = "17/03/2019 Sunday 14:25:25 02 PM";//"17/03/2019 Sunday 14:25:25 02 PM"
        LocalDateTime localDateTime1 = LocalDateTime.parse(time,DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE HH:mm:ss hh a"));
        System.out.println(localDateTime1);
    }
}
