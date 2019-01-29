package com.Sorting;

public class HeapSort {
    private int[] theArray;
    private int arraySize;

    private void fillArray() {
        arraySize = 7;
        theArray = new int[arraySize];
        int[] newArray= {1,8,5,7,3,9,6};
        theArray=newArray;
//        for (int i = 0; i < arraySize; i++)
//            theArray[i] = 10-i;
    }

    private void display() {
        for (int i = 0; i < arraySize; i++)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("--------------------");
        for (int arrayVal : theArray)
            System.out.print(arrayVal + " ");
        System.out.println();
        System.out.println("--------------------");
    }

    private void swap(int index1, int index2){
        int temp = theArray[index1];
        theArray[index1] = theArray[index2];
        theArray[index2] = temp;
    }

    private void heapify(int index,int n){
        int largest = index;
        int leftIndex  = (2 * index)+1;
        int rightIndex = (2 * index)+2;
        if(leftIndex < n && theArray[leftIndex] > theArray[largest])
            largest=leftIndex;
        if(rightIndex < n && theArray[rightIndex] > theArray[largest])
            largest=rightIndex;
        if(largest != index){
            swap(largest,index);
            heapify(largest,n);
        }
    }

    private void sort(){
        for(int i=((arraySize-1)/2);i>=0;i--)
            heapify(i,arraySize);

        for(int i=arraySize-1;i>=0;i--){
            swap(i,0);
            heapify(0,i);
        }
    }

    public static void main(String[] args){
        HeapSort heap = new HeapSort();
        heap.fillArray();
        heap.display();
        heap.sort();
        heap.display();
    }

}
