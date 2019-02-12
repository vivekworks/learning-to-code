package com.topics;

public class Wrapper {
    void wrap(){
        Integer intObj = 100;
        int intPrim = intObj;
        System.out.println(intPrim+" - "+intObj);
        intPrim=intPrim+1;
        intObj=intObj+1;
        Double d = 185.36;
        d=intPrim+d;
        System.out.println(intPrim+" - "+intObj+" - "+d);
        System.out.println(methodParam(intPrim));
        Long a = 1L;
    }
    int methodParam(Integer n){
        return n;
    }
}
