package com.collections;

public class Address {
    String name, city, state, street, code;
    Address(String n, String c, String s, String st, String cd){
        city=c;
        name=n;
        state=s;
        street=st;
        code=cd;
    }
    public String toString(){
        return name+", "+street+"\n"+city+", "+state+"\n"+code;
    }
}
