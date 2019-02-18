package com.generics;

public class ThreeGenDemo {
    void showDemo(){
        ThreeGen<String, Integer, Boolean> threeG1=new ThreeGen<>("One", 1,true);
        ThreeGen<Boolean, String, Integer> threeG2=new ThreeGen<>(true,"Two",1);
        threeG1.showTypes();
        threeG2.showTypes();
        int a = threeG1.getOb2();//Can't get anything else than ob2
        int b = threeG2.getOb3();//Can't get anything else than ob3
        //threeG1=threeG2;//Impossible to equate
        System.out.println(a+"-"+b+"-"+threeG1.getOb1());
    }
}
