package com.Recursion;

public class MergeSort {

    private int[] theMergeArray;

    private int arraySize = 10;

    private void mergeSort(int[] array, int start, int end){
        if(end >1){
            int middle = (start + end)/2;
            mergeSort(array, start, middle);//Left half
            mergeSort(array, middle+1, end);//Right half
            merge(array,start,middle,end);//Merge two halves
        }
    }

    private void merge(int[] array, int start, int middle, int end){

    }

    private void display(){
        System.out.println("-------------------------------------------------------------");
        System.out.print("|  ");
        for(int i=0;i<arraySize;i++) {
            System.out.print(i+"  |  ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.print("|  ");
        for(int i=0;i<arraySize;i++){
            theMergeArray[i] = (int)(Math.random() * 10);
            System.out.print(theMergeArray[i]+"  |  ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------");
    }

    private void fillArray(){
        theMergeArray = new int[arraySize];
        for(int i=0;i<arraySize;i++)
            theMergeArray[i] = (int)(Math.random() * 10);
    }

    public static void main(String[] args){
        MergeSort mergeSort = new MergeSort();
        mergeSort.fillArray();
        mergeSort.display();
        mergeSort.mergeSort(mergeSort.theMergeArray,0,mergeSort.arraySize-1);
    }
}
