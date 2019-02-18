package com.generics;

public class GenDemo {
    void showDemo(){
        Gen<Integer> value;
        value=new Gen<Integer>(88);
        value.showType();
        int i = value.getOb();
        System.out.println(i);
        Gen<String> strValue = new Gen<>("hey");
        String str = strValue.getOb();
        System.out.println(str);
        strValue.showType();
    }
}
