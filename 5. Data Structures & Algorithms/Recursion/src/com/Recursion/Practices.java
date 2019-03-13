package com.Recursion;

public class Practices {
    int[] arrayNav={5,6,8,9,3,4};
    /**
     * 1. Go through an array and print out all of the elements using Recursion
     */
    public String arrayNavigation(int index){
        if(index <0) return "";
        return arrayNav[index]+arrayNavigation(index-1);
    }

    /**
     * 2. Determine whether or not a string is a palindrome
     */
    public String palindromeOrNot(String s){
        if(s.length()<=0) return "";
        return s.substring(s.length()-1)+palindromeOrNot(s.substring(0,s.length()-1));
    }

    /**
     * 3. Calculate a raised to the power of b
     */

    public int powerOf(int a,int b){
        if(b <=1) return 1;
        return a*powerOf(a,b-1);
    }

    public static void main(String[] args){
        Practices practices = new Practices();
        //System.out.println(practices.arrayNavigation(practices.arrayNav.length-1));
        String palin="rotator";
        System.out.println(practices.palindromeOrNot(palin));
        System.out.println(practices.palindromeOrNot(palin).equals(palin));
        System.out.println(practices.powerOf(5,7));
    }
}
