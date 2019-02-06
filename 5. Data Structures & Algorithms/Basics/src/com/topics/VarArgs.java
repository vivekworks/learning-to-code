package com.topics;

public class VarArgs implements Interface,Interface2,Recursion.goonie{
    public void checkVarArgs(String ... s){
        for(String s1 :s)
            System.out.println(s1);
    }

    @Override
    public void chick() {
        Interface2.super.chick();
        Interface.super.chick();
    }

    public void munch(){

    }
}
