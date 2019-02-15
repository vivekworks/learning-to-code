package com.topics;

import java.lang.annotation.Inherited;

public class SubClass extends SuperClass {
    static {
        //System.out.println("Sub class static initializer");
    }

    public SubClass() {
        //System.out.println("Sub class Constructor");
    }

    public SubClass(int id, String name) {
        super.id = 1;
    }
    @Deprecated(since="2018",forRemoval = true)
    public String dob;
    @Override
    public void stuff() {
        System.out.println("It's just sub stuff");
    }

    public void muck(){

    }
}
