package com.topics;

public class Recursion {
    private String word;
    public Recursion(String word){
        this.word=word;
    }
    private void printReverse(int index){
        if (index < 0) return;
        System.out.print(word.charAt(index));
        printReverse(index-1);
        Interface.much();
        //int b = a;
    }
    public interface goonie{
        void munch();
    }
}
