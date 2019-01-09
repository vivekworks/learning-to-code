package com.Sorting;

import java.util.Arrays;

public class MergeSort {
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

    private void merge(int begin, int middle, int end) {
        int leftCounter = (middle - begin + 1);
        int rightCounter = (end - middle);
        int mergeCounter = end - begin + 1;
        int[] leftArray = Arrays.copyOfRange(theArray, begin, middle + 1);
        int[] rightArray = Arrays.copyOfRange(theArray, middle + 1, end + 1);
        int left = 0, right = 0, merge = 0;
        int[] mergeArray = new int[mergeCounter];
        while (left < leftCounter && right < rightCounter) {
            if (leftArray[left] < rightArray[right])
                mergeArray[merge++] = leftArray[left++];
            else if (leftArray[left] > rightArray[right])
                mergeArray[merge++] = rightArray[right++];
            else {
                mergeArray[merge++] = leftArray[left++];
                mergeArray[merge++] = rightArray[right++];
            }
        }
        while (left < leftCounter)
            mergeArray[merge++] = leftArray[left++];
        while (right < rightCounter)
            mergeArray[merge++] = rightArray[right++];
        System.arraycopy(mergeArray, 0, theArray, begin, mergeArray.length);
    }

    private void sort(int begin, int end) {
        if (begin < end) {
            int middle = (begin + end) / 2;
            sort(begin, middle);
            sort(middle + 1, end);
            merge(begin, middle, end);
        }
    }

    public static void main(String[] args) {
        MergeSort merSort = new MergeSort();
        merSort.fillArray();
        merSort.display();
        merSort.sort(0, merSort.arraySize - 1);
        merSort.display();
    }
}
