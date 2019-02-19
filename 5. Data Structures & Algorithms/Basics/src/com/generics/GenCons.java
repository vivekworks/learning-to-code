package com.generics;

class GenCons {
    private double val;
    <T extends Number> GenCons(T value){
        this.val=value.doubleValue();
    }
    void showValue(){
        System.out.println(val);
    }
}
