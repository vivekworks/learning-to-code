package com.Recursion;

public class CodingBat {

    public static void main(String[] args) {
        System.out.println(factorialOfANumber(5));
        System.out.println(bunnyEars(0));
        System.out.println(fibonacci(5));
        System.out.println(bunnyEars2(5));
    }

    @legend(createdDate = "14/03/2019", author = "Vivek", context = "Factorial of a number", returnValue = "int")
    static int factorialOfANumber(int n) {
        if (n <= 1) return 1;
        return n * factorialOfANumber(n - 1);
    }

    @legend(createdDate = "14/03/2019", author = "Vivek", context = "Bunny ears", returnValue = "int")
    static int bunnyEars(int bunnies) {
        if (bunnies <= 0) return 0;
        return bunnyEars(bunnies - 1) + 2;
    }

    @legend(createdDate = "14/03/2019", author = "Vivek", context = "Fibonacci Series", returnValue = "int")
    static int fibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    @legend(createdDate = "14/03/2019", author = "Vivek", context = "Bunny ears 2", returnValue = "int")
    static int bunnyEars2(int bunnies){
        if(bunnies==0) return 0;
        return (bunnies%2 == 1 ? 2 : 3)+bunnyEars2(bunnies-1);
    }
}
