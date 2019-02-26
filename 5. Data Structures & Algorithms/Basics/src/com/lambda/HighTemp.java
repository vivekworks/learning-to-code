package com.lambda;

public class HighTemp {
    private int hTemp;
    HighTemp(int h){
        this.hTemp=h;
    }
    boolean sameTemp(HighTemp ht2){
        return this.hTemp==ht2.hTemp;
    }
    boolean lessThanTemp(HighTemp ht2){
        return this.hTemp<ht2.hTemp;
    }
}
