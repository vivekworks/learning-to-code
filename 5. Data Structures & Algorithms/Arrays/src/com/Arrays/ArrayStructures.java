package com.Arrays;

public class ArrayStructures {
    private int[] theArray = new int[50];
    private int[] theArrayOne = new int[50];
    private int[] theArrayTwo = new int[50];
    private int[] theArrayThree = new int[50];
    private int arraySize = 10;

    private void generateRandomArray() {
        for (int i = 0; i < arraySize; i++) {
            int val = (int) (Math.random() * arraySize) + 10;
            theArray[i] = val;
            theArrayOne[i] = val;
            theArrayTwo[i] = val;
            theArrayThree[i] = val;
        }
    }

    private void printArray(int[] arrayToPrint) {
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < arraySize; i++)
            System.out.print("|  " + i + " ");
        System.out.println();
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < arraySize; i++)
            System.out.print("| " + arrayToPrint[i] + " ");
        System.out.println();
        System.out.println("--------------------------------------------------");
    }

    private String getValueAtIndex(int arrayIndex) {
        return arrayIndex >= 0 && arrayIndex < arraySize ? String.valueOf(theArray[arrayIndex]) : "None";
    }

    private boolean doesArrayContainThisValue(int value) {
        boolean result = false;
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value) {
                result = true;
                break;
            }
        }
        return result;
    }

    private String deleteIndex(int arrayIndex) {
        if (arrayIndex < 0 && arrayIndex > arraySize) return "Index not found";
        for (int i = arrayIndex; i < arraySize - 1; i++) {
            theArray[i] = theArray[i + 1];
        }
        arraySize--;
        return "Done";
    }

    private void insertValue(int value) {
        if (arraySize < 50) {
            theArray[arraySize] = value;
            arraySize++;
        }
    }

    private String linearSearchForValue(int value) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arraySize; i++) {
            if (theArray[i] == value)
                result.append(" " + i);
        }
        return result.toString().equals("") ? "-1" : result.toString();
    }

    private void swapValues(int firstIndex, int secondIndex, int[] theInputArray) {
        int temp = theInputArray[firstIndex];
        theInputArray[firstIndex] = theInputArray[secondIndex];
        theInputArray[secondIndex] = temp;
    }

    private void bubbleSortOne() {
        long startTime = System.currentTimeMillis();
        int count = 0;
        int swapCounter = -1;
        int arraySizeOne = arraySize;
        while (swapCounter != 0) {
            swapCounter = 0;
            for (int i = 0; i < arraySizeOne - 1; i++) {
                if (theArrayOne[i] > theArrayOne[i + 1]) {
                    swapValues(i, i + 1, theArrayOne);
                    swapCounter = 1;
                }
                count++;
                //System.out.println(theArray.toString());
            }
            arraySizeOne--;
            if (arraySizeOne < 1) break;
            count++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Bubble Sort One - TimeTaken : " + (endTime - startTime) + ", Count taken : " + count);
    }

    private void bubbleSortTwo() {
        boolean swapped = false;
        int count = 0;
        long startTime = System.currentTimeMillis();
        for (int i = arraySize - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (theArrayTwo[j] > theArrayTwo[j + 1]) {
                    swapValues(j, j + 1, theArrayTwo);
                    swapped = true;
                }
                count++;
                //System.out.println(theArray);
            }
            if (!swapped) break;
            count++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Bubble Sort Two - TimeTaken : " + (endTime - startTime) + ", Count taken : " + count);
    }

    private String binarySearchForValue(int value) {
        int lowerIndex = 0, higherIndex = arraySize - 1;
        int foundIndex = -1;
        while (lowerIndex <= higherIndex) {
            int middleIndex = (lowerIndex + higherIndex) / 2;
            if (theArrayOne[middleIndex] == value) {
                lowerIndex = higherIndex + 1;
                foundIndex = middleIndex;
            } else if (theArrayOne[middleIndex] > value)
                higherIndex = middleIndex - 1;
            else if (theArrayOne[middleIndex] < value)
                lowerIndex = middleIndex + 1;
        }
        return foundIndex == -1 ? "Not found" : String.valueOf(foundIndex);
    }

    private void insertionSort(){
        for (int i=1;i<arraySize;i++){
            int j=i;
            int insert = theArrayThree[i];
            while((j>0) && (insert < theArrayThree[j-1])){
                theArrayThree[j] = theArrayThree[j-1];
                j--;
            }
            theArrayThree[j] = insert;
        }
    }

    public static void main(String[] args) {
        ArrayStructures arrayStruct = new ArrayStructures();
        arrayStruct.generateRandomArray();
        System.out.println("Array Generated");
        arrayStruct.printArray(arrayStruct.theArray);
        /*arrayStruct.bubbleSortOne();
        System.out.println(arrayStruct.getValueAtIndex(5));
        System.out.println("The Array contains the value on the index : " + arrayStruct.doesArrayContainThisValue(12));
        arrayStruct.deleteIndex(7);
        arrayStruct.printArray(arrayStruct.theArray);
        arrayStruct.insertValue(82);
        arrayStruct.printArray(arrayStruct.theArray);
        System.out.println("The Array contains the value at index : " + arrayStruct.linearSearchForValue(14));
        arrayStruct.printArray(arrayStruct.theArrayOne);
        arrayStruct.bubbleSortOne();
        arrayStruct.printArray(arrayStruct.theArrayOne);
        arrayStruct.printArray(arrayStruct.theArrayTwo);
        arrayStruct.bubbleSortTwo();
        arrayStruct.printArray(arrayStruct.theArrayTwo);
        System.out.println(arrayStruct.binarySearchForValue(15));*/
        arrayStruct.insertionSort();
        arrayStruct.printArray(arrayStruct.theArrayThree);
    }
}
