package com.generics;

public class GenMethDemo {
    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (V val : y)
            if (val == x) return true;
        return false;
    }

    void showDemo() {
        Integer[] intArray = {1, 2, 3, 4};
        System.out.println(isIn(1, intArray));
        Double[] doubleArray={1.2,2.3,4.5,7.7};
        //System.out.println(isIn(2, doubleArray));//Compilation error. Type mismatch between int and double array
        System.out.println(isIn(2.5, doubleArray));
        String[] strArray={"One","Two","Three"};
        System.out.println(isIn("Four", strArray));
    }
}
