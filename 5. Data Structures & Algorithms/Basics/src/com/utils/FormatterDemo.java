package com.utils;

import java.util.Calendar;
import java.util.Formatter;

public class FormatterDemo {
    static void utilize(){
        try(Formatter formatter = new Formatter()) {
            formatter.format("The book %s I study is %d pages long", "Java : Complete Reference", 1200);
            Calendar cal = Calendar.getInstance();
            formatter.format("%nToday is %te %tB, %tY", cal, cal, cal);
            formatter.format("%n%f%n%012f%n%12f", 10.12345, 10.12345, 10.12345);
            formatter.format("%n%.3f%n%012.4f%n%12.3e", 10.12345, 10.12345, 10.12345);
            formatter.format("%n%.15s", "Java is an amazing language and it can be written easily");
            formatter.format("%n% d%n% d", 100, -100);
            formatter.format("%d", 200);
            System.out.println(formatter);
        }
        System.out.printf("%n%f%n%012f%n%12f", 10.545454, 10.545454, 10.545454);
    }
}
