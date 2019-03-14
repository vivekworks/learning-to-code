package com.Recursion;

import java.util.Scanner;

public class Practices {
    int[] arrayNav = {5, 6, 8, 9, 3, 4};
    int n = 25;

    /**
     * 1. Go through an array and print out all of the elements using Recursion
     */
    public String arrayNavigation(int index) {
        if (index < 0) return "";
        return arrayNav[index] + arrayNavigation(index - 1);
    }

    /**
     * 2. Determine whether or not a string is a palindrome
     */
    public String palindromeOrNot(String s) {
        if (s.length() <= 0) return "";
        return s.substring(s.length() - 1) + palindromeOrNot(s.substring(0, s.length() - 1));
    }

    /**
     * 3. Calculate a raised to the power of b
     */

    public int powerOf(int a, int b) {
        if (b <= 1) return 1;
        return a * powerOf(a, b - 1);
    }

    /**
     * 4. Print 1 to N Recursively
     */

    public void print1toN(int limit) {
        if (limit <= 0) return;
        else {
            System.out.print((n - limit + 1) + " ");
            print1toN(limit - 1);
        }
    }

    /**
     * 5. Print N to 1 Recursively
     */

    public void printNto1(int limit){
        if(limit <= 0) return;
        else {
            System.out.print(limit + " ");
            printNto1(limit - 1);
        }
    }

    /**
     * 6. Recursively Reverse a String
     */

    public String reverseAString(String word){
        if(word==null || word.equals("")) return "";
        return word.substring(word.length()-1)+reverseAString(word.substring(0,word.length()-1));
    }

    public static void main(String[] args) {
        Practices practices = new Practices();
        //System.out.println(practices.arrayNavigation(practices.arrayNav.length-1));
        //String palin = "rotator";
        //System.out.println(practices.palindromeOrNot(palin));
        //System.out.println(practices.palindromeOrNot(palin).equals(palin));
        //System.out.println(practices.powerOf(5, 7));
        /*Scanner scanInput = new Scanner(System.in);
        int count=scanInput.nextInt();
        for(int i =0;i<count;i++){
            practices.n = scanInput.nextInt();
            practices.printNto1(practices.n);
            System.out.println();
        }*/
        //practices.print1toN(practices.n);
        System.out.println(practices.reverseAString("hello"));
    }
}
