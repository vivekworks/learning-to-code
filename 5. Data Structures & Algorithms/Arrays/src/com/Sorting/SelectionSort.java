package com.Sorting;

class SelectionSort {
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
        for(int i=0;i<arraySize;i++){
            for(int j=i+1;j<arraySize;j++){
                if(theArray[i] > theArray[j])
                    swap(i, j);
            }
        }
    }
    public static void main(String[] args){
        SelectionSort selSort = new SelectionSort();
        selSort.fillArray();
        selSort.display();
        selSort.sort();
        System.out.println();
        selSort.display();
    }
}
