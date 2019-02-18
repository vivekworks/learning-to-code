package com.generics;

public class NonGen {
    Object ob;
    NonGen(Object ob){
        this.ob=ob;
    }
    Object getOb(){
        return ob;
    }
    void showType(){
        System.out.println("Ob is of class : "+ob.getClass().getName());
    }
}
