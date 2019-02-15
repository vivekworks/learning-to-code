package com.topics;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

public class VarArgs implements Interface,Interface2,Recursion.goonie{
    @SafeVarargs
    public final void checkVarArgs(String ... s){
        for(String s1 :s)
            System.out.println(s1);
    }

    @Override
    public void chick() {
        Interface2.super.chick();
        //Interface.super.chuck();
    }
    @SuppressWarnings("hey")
    public void munch(){

    }

    @Override
    public void chuck() {

    }
}
