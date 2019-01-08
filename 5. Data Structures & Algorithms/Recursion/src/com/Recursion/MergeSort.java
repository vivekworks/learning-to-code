package com.Recursion;

import java.util.Arrays;

public class MergeSort {

    private int[] theMergeArray;

    private int arraySize = 10;

    private void mergeSort(int[] array, int start, int end) {
            int middle = (start + end) / 2;
            int leftCount = middle-start+1;
            int rightCount = end-middle;
            if(leftCount>1)
                mergeSort(array, start, middle);//Left half
            if(rightCount>1)
                mergeSort(array, middle + 1, end);//Right half
            if(leftCount>0 && rightCount>0)
                merge(array, start, middle, end);//Merge two halves
    }

    private void merge(int[] array, int start, int middle, int end) {

        int[] tempOne = Arrays.copyOfRange(array, start,middle + 1);
        int[] tempTwo = Arrays.copyOfRange(array, middle+1,end+1);
        int[] tempMerge = new int[end - start + 1];
        int left = 0, right = 0, merge = 0;
        while (left < (middle - start + 1) && right < (end - middle)) {
            if (tempOne[left] < tempTwo[right])
                tempMerge[merge++] = tempOne[left++];
            else if (tempOne[left] > tempTwo[right])
                tempMerge[merge++] = tempTwo[right++];
            else {
                tempMerge[merge++] = tempTwo[right++];
                tempMerge[merge++] = tempOne[left++];
            }
        }
        while (right < ((end - middle)))
            tempMerge[merge++] = tempTwo[right++];
        while (left < (middle - start + 1))
            tempMerge[merge++] = tempOne[left++];
        for(int value :tempMerge)
            array[start++]=value;
    }

    private void display(int[] array) {
        System.out.println("-------------------------------------------------------------");
        System.out.print("|  ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + "  |  ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------");
        System.out.print("|  ");
        for (int arr :array) {
            System.out.print(arr + "  |  ");
        }
        System.out.println();
        System.out.println("-------------------------------------------------------------");
    }

    private void fillArray() {
        theMergeArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++)
            theMergeArray[i] = (int) (Math.random() * 10);
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.fillArray();
        mergeSort.display(mergeSort.theMergeArray);
        mergeSort.mergeSort(mergeSort.theMergeArray, 0, mergeSort.arraySize - 1);
        mergeSort.display(mergeSort.theMergeArray);
    }
}
