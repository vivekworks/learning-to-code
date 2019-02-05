package com.topics;

public class SubClass extends SuperClass {
    static{
        //System.out.println("Sub class static initializer");
    }
    public SubClass(){
        //System.out.println("Sub class Constructor");
    }
    public SubClass(int id, String name){
        super.id=1;
    }
    public String dob;
    public void stuff(){
        System.out.println("It's just sub stuff");
    }
}
