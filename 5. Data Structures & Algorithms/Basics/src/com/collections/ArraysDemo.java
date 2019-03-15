package com.collections;

import java.util.Arrays;

public class ArraysDemo {
    static void check(){
        int[] array = new int[10];
        for(int i=0;i<10;i++)
            array[i]=-3*i;
        print(array);
        Arrays.sort(array);
        print(array);
        Arrays.fill(array,1,4,2);
        print(array);
        Arrays.sort(array);
        print(array);
        int indexValue = Arrays.binarySearch(array,-27);
        System.out.println(indexValue);
    }

    private static void print(int[] array){
        System.out.println(Arrays.toString(array));
    }
}
