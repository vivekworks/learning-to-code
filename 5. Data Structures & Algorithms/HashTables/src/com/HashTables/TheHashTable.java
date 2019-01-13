package com.HashTables;

import java.util.ArrayList;
import java.util.Arrays;

public class TheHashTable {
    private Integer[] theArray = {10,34,56,776,908,100,298,765,22,87,364,492,411,333,900};
    private int arraySize;
    private int[] theHashArray;
    private TheHashTable(int size){
        this.arraySize=size;
        //this.theArray=new int[this.arraySize];
        this.theHashArray=new int[this.arraySize];
        Arrays.fill(this.theHashArray,-1);
    }
    private void generateArray(){
        for(int i=0;i<10;i++)
            theArray[i]=(int)(Math.random()*10);
        for(int i=10;i<arraySize;i++)
            theArray[i]=(int)(Math.random()*10)+10;
    }
    private void display(int[] theArray){
            for (int i = 0; i < theArray.length; i++) {
                int length = String.valueOf(theArray[i]).length() - String.valueOf(i).length();
                String space = "";
                if (length == 1)
                    space = " ";
                else if (length == 2)
                    space = "  ";
                System.out.print(i + space + " | ");
            }
            System.out.println();
            //System.out.println("------------------------------------------------------------------------------------");
        for (int i = 0; i < theArray.length; i++)
                System.out.print(theArray[i] + " | ");
            System.out.println();
            //System.out.println("------------------------------------------------------------------------------------");
    }
    private void display(Integer[] theArray){
        for (int i = 0; i < theArray.length; i++) {
            int length = String.valueOf(theArray[i]).length() - String.valueOf(i).length();
            String space = "";
            if (length == 1)
                space = " ";
            else if (length == 2)
                space = "  ";
            System.out.print(i + space + " | ");
        }
        System.out.println();
        //System.out.println("------------------------------------------------------------------------------------");
        for (int i = 0; i < theArray.length; i++)
            System.out.print(theArray[i] + " | ");
        System.out.println();
        //System.out.println("------------------------------------------------------------------------------------");
    }
    private void hashFunction(){
        for(int i=0;i<theArray.length;i++){
            int arrayIndex = theArray[i]%arraySize;
            while(theHashArray[arrayIndex] != -1){
                ++arrayIndex;
                arrayIndex%=(arraySize);
            }
            theHashArray[arrayIndex]=theArray[i];
        }
    }
    private void doubleHashFunction(){
        for(int i=0;i<theArray.length;i++){
            int arrayIndex = theArray[i]%arraySize;
            while(theHashArray[arrayIndex] != -1){
                arrayIndex+=5;
                arrayIndex%=(arraySize);
            }
            theHashArray[arrayIndex]=theArray[i];
        }
    }
    private String findByKey(int key){
        int arrayIndex = key%arraySize;
        int count=0;
        while(count <arraySize){
            if(theHashArray[arrayIndex] == key){
                return "In the index "+arrayIndex+", the value is "+key;
            }
            ++arrayIndex;
            arrayIndex%=arraySize;
            count++;
        }
        return null;
    }
    private String findByKeyDoubleHash(int key){
        int arrayIndex = key%arraySize;
        int count=0;
        while(count <arraySize){
            if(theHashArray[arrayIndex] == key){
                return "In the index "+arrayIndex+", the value is "+key;
            }
            arrayIndex+=5;
            arrayIndex%=arraySize;
            count++;
        }
        return null;
    }
    private boolean isPrime(int number){
        if(number % 2 == 0)
            return false;
        else{
            for(int i=3;i<number;i+=2)
                return number%i != 0;
        }
        return true;
    }
    private int getNextPrime(int minimumNumber){
        for(int i = minimumNumber;true;++i){
            if(isPrime(i))
                return i;
        }
    }
    private void increaseArraySize(int minimumArraySize){
        arraySize = getNextPrime(minimumArraySize);
        System.out.println(arraySize);
        theHashArray=new int[arraySize];
        Arrays.fill(theHashArray,-1);
        theArray = moveOldArray();
        System.out.println(Arrays.toString(theArray));
        hashFunction();
    }
    private Integer[] moveOldArray(){
        ArrayList<Integer> list = new ArrayList<>();
        for(int value :theArray)
            list.add(value);
        return list.toArray(new Integer[list.size()]);
    }
    public static void main(String[] args){
        TheHashTable hashTable = new TheHashTable(15);
        hashTable.display(hashTable.theArray);
        hashTable.hashFunction();
        hashTable.display(hashTable.theHashArray);
        System.out.println(hashTable.findByKey(333));
        System.out.println(hashTable.isPrime(45));
        System.out.println(hashTable.getNextPrime(80));
        hashTable.increaseArraySize(30);
        hashTable.display(hashTable.theHashArray);
        Arrays.fill(hashTable.theHashArray,-1);
        hashTable.doubleHashFunction();
        hashTable.display(hashTable.theHashArray);
        System.out.println(hashTable.findByKeyDoubleHash(298));
    }
}
