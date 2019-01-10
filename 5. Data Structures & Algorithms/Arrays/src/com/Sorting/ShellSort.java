package com.Sorting;

public class ShellSort {
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
        System.out.println("--------------------");
    }

    private void sort(){
        int n= arraySize;
        while((n=n/2)>0){
            for(int i=n;i<arraySize;i++){
                int temp = theArray[i];
                int j =i;
                while(j>=n && temp < theArray[j-n]){
                    theArray[j]=theArray[j-n];
                    j=j-n;
                }
                theArray[j]=temp;
            }
        }
    }

    public static void main(String[] args){
        ShellSort shell = new ShellSort();
        shell.fillArray();
        shell.display();
        shell.sort();
        shell.display();
    }
}
