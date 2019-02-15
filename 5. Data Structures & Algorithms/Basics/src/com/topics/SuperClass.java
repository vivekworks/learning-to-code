package com.topics;


import java.lang.annotation.*;

@Target({ElementType.METHOD})

@Retention(RetentionPolicy.RUNTIME)
@interface inheritCheck{
    double version() default 1.0;
}

public class SuperClass {
    int id;
    public String name;
    double hello=1.4;
    static{
        //System.out.println("Super class static initializer");
    }

    public SuperClass(){
        //System.out.println("Super class Constructor");
    }
    @inheritCheck(version = 2.0)
    public void stuff(){
        System.out.println("It's just super stuff");
    }
    /*public SuperClass(int id, String name){
        this.id = id;
        this.name = name;
    }*/
}
