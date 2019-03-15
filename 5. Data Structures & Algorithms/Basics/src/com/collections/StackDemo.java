package com.collections;

import java.util.Stack;

public class StackDemo {
    static void check(){
        Stack<String> stackD = new Stack<>();
        stackD.push("Harry");
        stackD.push("Ron");
        stackD.push("Hermoine");
        stackD.push("Voldemort");
        System.out.println(stackD);
        for(String value :stackD){
            System.out.println(value);
        }
        stackD.pop();
        stackD.pop();
        System.out.println(stackD);
    }
}
