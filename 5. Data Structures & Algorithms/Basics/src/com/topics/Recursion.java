package com.topics;

public class Recursion {
    private String word;
    public Recursion(String word){
        this.word=word;
    }
    public void printReverse(int index){
        if (index < 0) return;
        System.out.print(word.charAt(index));
        printReverse(index-1);
    }
}
