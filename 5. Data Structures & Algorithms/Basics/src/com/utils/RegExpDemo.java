package com.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpDemo {
    static void utilize(){
        Pattern pattern;
        Matcher matcher;
        pattern = Pattern.compile("test");
        matcher = pattern.matcher("test 1 2 3 test");
        //System.out.println(matcher.matches());
        while(matcher.find())
            System.out.println(matcher.start());
        pattern = Pattern.compile("W+");
        matcher = pattern.matcher("WW WWW WW W");
        while(matcher.find())
            System.out.println(matcher.group());
        pattern = Pattern.compile("A.+t");//Greedy Behaviour
        matcher = pattern.matcher("Abstract data can be usually an extract of the main construct which later can be made concrete");
        while(matcher.find())
            System.out.println(matcher.group());
        pattern = Pattern.compile("A.+?t");//Reluctant Behaviour
        matcher = pattern.matcher("Abstract data can be usually an Axtract of the main Aonstruct which later can be made Aoncrete");
        while(matcher.find())
            System.out.println(matcher.group());
        pattern = Pattern.compile("A.?+t");//Possessive Behaviour
        matcher = pattern.matcher("Abstract data can be usually an Axtract of the main Aonstruct which later can be made Aoncrete");
        while(matcher.find())
            System.out.println(matcher.group());
        System.out.println("Classes : ");
        pattern = Pattern.compile("[a-z]+");
        matcher = pattern.matcher("Abstract data can be usually an Axtract of the main Aonstruct which later can be made Aoncrete");
        while(matcher.find())
            System.out.println(matcher.group());
        pattern = Pattern.compile("[.,;!]");//Reluctant Behaviour
        String[] str = pattern.split("Hey, hello everybody! Welcome to our home; make yourself comfy.");
        for(String stri :str)
            System.out.println(stri);
    }
}
