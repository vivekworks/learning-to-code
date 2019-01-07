package com.Recursion;

public class TheRecursion {

    private int triangularNumber(int limit) {
        if (limit <= 1)
            return 1;
        else
            return limit + (triangularNumber(limit - 1));
    }

    private int factorial(int limit) {
        if (limit <= 1)
            return 1;
        else
            return limit * (factorial(limit - 1));
    }

    public static void main(String[] args) {
        TheRecursion recursion = new TheRecursion();
        System.out.println("Triangular Number of 5 : "+recursion.triangularNumber(5));
        System.out.println("Factorial of 8 : "+recursion.factorial(8));
    }
}

