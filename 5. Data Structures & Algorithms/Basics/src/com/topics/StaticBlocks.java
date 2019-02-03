package com.topics;

public class StaticBlocks {
    static int a = 10;
    static int b;
    public static void main(String[] args){
        meth(10);
    }
    static void meth(int c){
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
    static {
        System.out.println("Static initializer");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        b = a*3;
    }
}
