package com.lambda;

import java.util.Scanner;

public class LambdaAsArgsDemo {
    String func(StringFunc sf, String s){
        return sf.func(s);
    }
    public void lambdaCheck(){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String b = func((s) -> {
            String a="";
            for(char val :s.toCharArray())
                a=val+a;
            return a;
        },input);
        String d = func(LambdaAsArgsDemo::funcProcess,input);
        System.out.println(d);
        System.out.println(b);
        StringFunc c = (s) -> s.toUpperCase();
        System.out.println(c.func(input));
        System.out.println(func(c,input));
    }

    static String funcProcess(String s){
        String a="";
        for(char val :s.toCharArray())
            a=val+a;
        return a;
    }
}
