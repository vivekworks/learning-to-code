package com.Arrays;

public class ArrayStructures {
    private int[] theArray= new int[50];
    private int arraySize = 10;
    public void generateRandomArray(){
        for (int i=0;i<arraySize;i++){
            theArray[i] = (int)(Math.random() * arraySize)+10;
        }
    }
    public void printArray(){
        for (int i=0;i<arraySize;i++){
            System.out.println("----------");
            System.out.println("| "+i+" | "+theArray[i]+" |");
            System.out.println("----------");
        }
    }
    public String getValueAtIndex(int arrayIndex){
        return arrayIndex>=0 && arrayIndex<arraySize  ? String.valueOf(theArray[arrayIndex]) : "None";
    }
    public boolean doesArrayContainThisValue(int value){
        boolean result=false;
        for (int i=0;i<arraySize;i++){
            if(theArray[i]==value) {
                result = true;
                break;
            }
        }
        return result;
    }
    public String deleteIndex(int arrayIndex){
        if (arrayIndex<0 && arrayIndex>arraySize) return "Index not found";
        for (int i=arrayIndex;i<arraySize-1;i++){
            theArray[i]=theArray[i+1];
        }
        arraySize--;
        return "Done";
    }
    public void insertValue(int value){
        if (arraySize<50) {
            theArray[arraySize] = value;
            arraySize++;
        }
    }
    public String linearSearchForValue(int value){
        String result="";
        for (int i=0;i<arraySize;i++){
            if (theArray[i] == value)
                result+=" "+i;
        }
        return result.equals("") ? "-1" : result;
    }
    public static void main(String[] args){
        ArrayStructures arrayStruct = new ArrayStructures();
        arrayStruct.generateRandomArray();
        arrayStruct.printArray();
        System.out.println(arrayStruct.getValueAtIndex(5));
        System.out.println("The Array contains the value on the index : "+arrayStruct.doesArrayContainThisValue(12));
        arrayStruct.deleteIndex(7);
        arrayStruct.printArray();
        arrayStruct.insertValue(82);
        arrayStruct.printArray();
        System.out.println("The Array contains the value at index : "+arrayStruct.linearSearchForValue(14));
    }
}
