package com.lambda;

public class ConsClass {

    ConsClass(){
        System.out.println("ConsClass No Arg Constructor");
    }

    ConsClass(String s){
        System.out.println("ConsClass Single Arg Constructor - "+s);
    }

    static void check(){
        ConsInterface consInterface = ConsClass::new;
        consInterface.consConstr("Hello");
    }
}
