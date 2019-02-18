package com.generics;
import static java.lang.System.out;

public class ThreeGen<T, V, E> {
    T ob1;
    V ob2;
    E ob3;
    ThreeGen(T ob1, V ob2, E ob3){
        this.ob1=ob1;
        this.ob2=ob2;
        this.ob3=ob3;
    }
    void showTypes(){
        out.println("T is of type : "+ob1.getClass().getName());
        out.println("V is of type : "+ob2.getClass().getName());
        out.println("E is of type : "+ob3.getClass().getName());
    }
    T getOb1(){
        return ob1;
    }
    V getOb2(){
        return ob2;
    }
    E getOb3(){
        return ob3;
    }
}
