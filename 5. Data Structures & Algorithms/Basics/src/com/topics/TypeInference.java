package com.topics;

public class TypeInference {
    public void varCheck(){
        var a = 10;
        System.out.println(a);
        int var = 2;
        System.out.println(var);
        int q=65;
        char w = (char)q;
        byte b = 10;
        b = (byte)(b *2);
        System.out.println(q+" - "+w+" - "+b);
    }
}
