package com.Sorting;

public class InsertionSort {
    private int[] theArray;
    private int arraySize;

    private void fillArray() {
        arraySize = 10;
        theArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 10);
        }
    }

    private void display() {
        for (int i = 0; i < arraySize; i++)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("--------------------");
        for (int arrayVal : theArray)
            System.out.print(arrayVal + " ");
        System.out.println();
    }

    private void sort() {
        for (int i = 1; i < arraySize; i++) {
            int arrayVal = theArray[i];
            int j=i;
            while(j>0 && (arrayVal < theArray[j-1])){
                theArray[j] = theArray[j-1];
                j--;
            }
            theArray[j]=arrayVal;
        }
    }

    public static void main(String[] args) {
        InsertionSort insSort = new InsertionSort();
        insSort.fillArray();
        insSort.display();
        insSort.sort();
        insSort.display();
    }
}
