package com.Sorting;

public class BubbleSort {
    private int[] theArray;
    private int arraySize;
    private void fillArray(){
        arraySize=10;
        theArray = new int[arraySize];
        for(int i=0;i<arraySize;i++){
            theArray[i]= (int)(Math.random()*10);
        }
    }
    private void display(){
        for(int i=0;i<arraySize;i++)
            System.out.print(i+" ");
        System.out.println();
        System.out.println("--------------------");
        for(int arrayVal :theArray)
            System.out.print(arrayVal+" ");
        System.out.println();
    }
    private void swap(int index1, int index2){
        int temp = theArray[index1];
        theArray[index1] = theArray[index2];
        theArray[index2] = temp;
    }
    private void sort(){
        boolean swapInd = true;
        while(swapInd) {
            swapInd=false;
            for (int i = 0; i < arraySize - 1; i++) {
                if (theArray[i] > theArray[i + 1]) {
                    swap(i, i + 1);
                    swapInd = true;
                }
            }
        }
    }
    public static void main(String[] args){
        BubbleSort bubSort = new BubbleSort();
        bubSort.fillArray();
        bubSort.display();
        bubSort.sort();
        System.out.println();
        bubSort.display();
    }
}
