package com.generics;

public class Gen<V> {
    V ob;
    Gen(V value){
        this.ob=value;
    }
    V getOb(){
        return ob;
    }
    void showType(){
        System.out.println("T is of type : "+ob.getClass().getName());
    }
}
