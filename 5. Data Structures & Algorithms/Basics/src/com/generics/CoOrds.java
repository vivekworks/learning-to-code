package com.generics;

public class CoOrds<T extends TwoD> {
    T[] coords;
    CoOrds(T[] coords){
        this.coords=coords;
    }
}
