package com.utils;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendarDemo {
    static void utilize(){
        Calendar cal = Calendar.getInstance();
        cal.set(2019,Calendar.DECEMBER,28);
        System.out.println(cal.getTime());
        System.out.println(cal.get(Calendar.MAY));
        GregorianCalendar gregCal = new GregorianCalendar();
        System.out.println(gregCal.getCalendarType()+" : "+gregCal.getGregorianChange());
        System.out.println(gregCal.isLeapYear(2000));
        GregorianCalendar gregCal1 = new GregorianCalendar(Locale.CHINESE);
        System.out.println(gregCal1);
        System.out.println(Arrays.toString(Locale.getISOLanguages()));
    }
}
