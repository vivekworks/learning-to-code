package com.generics;

public class GenSuperClass<T> {//extends Throwable
    T ob;
    GenSuperClass(T ob){
        this.ob=ob;
    }
    T getOb(){
        System.out.println("SuperClass Ob");
        return ob;
    }

    static <T extends Number> T retu(){
        return null;
    }
}
