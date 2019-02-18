package com.generics;

public class NonGenDemo {
    void showDemo(){
        NonGen intValue = new NonGen(88);
        intValue.showType();
        int a = (int) intValue.getOb();//Casting is required
        NonGen strValue = new NonGen("Hey");
        strValue.showType();
        String b = (String) strValue.getOb();
        a = (int) strValue.getOb();//Wrong casting and blows up runtime
    }
}
