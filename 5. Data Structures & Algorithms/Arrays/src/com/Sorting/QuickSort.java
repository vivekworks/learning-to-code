package com.Sorting;

public class QuickSort {
    private int[] theArray;
    private int arraySize;

    private void fillArray() {
        arraySize = 10;
        theArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++)
            theArray[i] = (int) (Math.random() * 10);
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

    private void swap(int indexOne, int indexTwo){
        int temp = theArray[indexOne];
        theArray[indexOne]=theArray[indexTwo];
        theArray[indexTwo]=temp;
    }

    private int partition(int startIndex, int endIndex, int pivot){
        int left=startIndex, right=endIndex-1;
        while(left<=right){
            if(theArray[left] > pivot){
                if(theArray[right]< pivot) {
                    swap(left, right);
                    left++;
                    right--;
                }
                else
                    right--;
            } else
                left++;
        }
        swap(left,endIndex);
        return left;
    }

    private void sort(int startIndex, int endIndex){
        if(startIndex < endIndex){
            int pivot = theArray[endIndex];
            int pivotPosition = partition(startIndex, endIndex, pivot);
            sort(startIndex, pivotPosition-1);
            sort(pivotPosition+1,endIndex);
        }
    }

    public static void main(String[] args){
        QuickSort qSort = new QuickSort();
        qSort.fillArray();
        qSort.display();
        qSort.sort(0, qSort.arraySize-1);
        qSort.display();
    }
}
