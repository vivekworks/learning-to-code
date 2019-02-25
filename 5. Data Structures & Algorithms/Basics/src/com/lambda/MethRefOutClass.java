package com.lambda;

public class MethRefOutClass {
    double methCheck(double value){
        System.out.println("MethRefOutClass.methCheck");
        return value/2;
    }
    static double methStatCheck(double value){
        System.out.println("MethRefOutClass.StaticMethCheck");
        return value/3;
    }
}
