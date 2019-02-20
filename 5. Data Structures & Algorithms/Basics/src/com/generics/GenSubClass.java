package com.generics;

public class GenSubClass extends GenSuperClass<String> {
    GenSubClass(String ob){
        super(ob);
    }

    String getOb(){
        System.out.println("SubClass Ob");
        return null;
    }
}