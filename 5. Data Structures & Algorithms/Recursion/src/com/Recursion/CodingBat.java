package com.Recursion;

import java.util.stream.StreamSupport;

public class CodingBat {

    public static void main(String[] args) {
        //System.out.println(factorialOfANumber(5));
        //System.out.println(bunnyEars(0));
        //System.out.println(fibonacci(5));
        //System.out.println(bunnyEars2(5));
        //System.out.println(triangle(5));
        //System.out.println(sumDigits(895));
        //System.out.println(count7(678574387));
        //System.out.println(count8(8818181));
        //System.out.println(powerN(3, 1));
        //System.out.println(countX("hi"));
        //System.out.println(countHi("hi"));
        //System.out.println(changeXY("codex"));
        //System.out.println(changePi("xpix"));
        //System.out.println(noX("xaxb"));
        //int[] array6 = {1,4};
        //System.out.println(array6(array6,0));
        //int[] array11 = {1,2,3,4};
        //System.out.println(array11(array11,0));
        //int[] array220 = {1,2,22,4,44,5,50};
        //System.out.println(array220(array220,0));
        //System.out.println(allStar(""));
        //System.out.println(pairStar("xxyy"));
        //System.out.println(endX("xhaxhix"));
        //System.out.println(countPairs("xAxAxo"));
        //System.out.println(countAbc("abcxxabc"));
        System.out.println(count11("abc11x11x11"));
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
    static int bunnyEars2(int bunnies) {
        if (bunnies == 0) return 0;
        return (bunnies % 2 == 1 ? 2 : 3) + bunnyEars2(bunnies - 1);
    }

    @legend(createdDate = "14/03/2019", author = "Vivek", context = "Triangle", returnValue = "int")
    static int triangle(int rows) {
        if (rows <= 0) return 0;
        return rows + triangle(rows - 1);
    }

    @legend(createdDate = "14/03/2019", author = "Vivek", context = "Sum of Digits", returnValue = "int")
    static int sumDigits(int n) {
        if (n <= 0) return 0;
        return n % 10 + sumDigits(n / 10);
    }

    @legend(createdDate = "15/03/2019", author = "Vivek", context = "Count 7", returnValue = "int")
    static int count7(int n) {
        if (n <= 0) return 0;
        return (n % 10 == 7 ? 1 : 0) + count7(n / 10);
    }

    @legend(createdDate = "15/03/2019", author = "Vivek", context = "Count 8", returnValue = "int")
    static int count8(int n) {
        if (n <= 0) return 0;
        return (n % 10 == 8 ? 1 : 0) + (n % 100 == 88 ? 1 : 0) + count8(n / 10);
    }

    @legend(createdDate = "15/03/2019", author = "Vivek", context = "Power of N", returnValue = "int")
    static int powerN(int base, int n) {
        if (n == 0) return 1;
        return base * powerN(base, n - 1);
    }

    @legend(createdDate = "15/03/2019", author = "Vivek", context = "Count X", returnValue = "int")
    static int countX(String str) {
        if (str == null || str.equals("")) return 0;
        return (str.substring(str.length() - 1).equals("x") ? 1 : 0) + countX(str.substring(0, str.length() - 1));
    }

    @legend(createdDate = "15/03/2019", author = "Vivek", context = "Count Hi", returnValue = "int")
    static int countHi(String str) {
        if (str.length() <= 1) return 0;
        return (str.substring(str.length() - 2).equals("hi") ? 1 : 0) + countHi(str.substring(0, str.length() - 1));
    }

    @legend(createdDate = "15/03/2019", author = "Vivek", context = "Change XY", returnValue = "String")
    static String changeXY(String str) {
        if (str.length() <= 0) return "";
        return changeXY(str.substring(0, str.length() - 1)) + (str.substring(str.length() - 1).equals("x") ? "y" : str.substring(str.length() - 1));
    }

    @legend(createdDate = "15/03/2019", author = "Vivek", context = "Change Pi", returnValue = "String")
    static String changePi(String str) {
        if (str.length() <= 1) return str;
        return (str.substring(str.length() - 2).indexOf("pi") >= 0 ? changePi(str.substring(0, str.length() - 2)) + "3.14" : changePi(str.substring(0, str.length() - 1)) + str.substring(str.length() - 1));
    }

    @legend(createdDate = "15/03/2019", author = "Vivek", context = "Remove x", returnValue = "String")
    static String noX(String str) {
        if (str.length() == 0) return "";
        return noX(str.substring(0, str.length() - 1)) + (str.charAt(str.length() - 1) == 'x' ? "" : str.charAt(str.length() - 1));
    }

    @legend(createdDate = "15/03/2019", author = "Vivek", context = "Find 6 in an array", returnValue = "boolean")
    static boolean array6(int[] nums, int index) {
        if (index >= nums.length) return false;
        return nums[index] == 6 ? true : array6(nums, index + 1);
    }

    @legend(createdDate = "15/03/2019", author = "Vivek", context = "Find no. of times of 11", returnValue = "int")
    static int array11(int[] nums, int index) {
        if (index >= nums.length) return 0;
        return (nums[index] == 11 ? 1 : 0) + array11(nums, index + 1);
    }

    @legend(createdDate = "15/03/2019", author = "Vivek", context = "x and 10(x)", returnValue = "boolean")
    static boolean array220(int[] nums, int index) {
        if (index >= nums.length - 1) return false;
        return nums[index + 1] == nums[index] * 10 ? true : array220(nums, index + 1);
    }

    @legend(createdDate = "15/03/2019", author = "Vivek", context = "Append *", returnValue = "String")
    static String allStar(String str) {
        if (str.length() <= 1) return str;
        return allStar(str.substring(0, str.length() - 1)) + '*' + str.substring(str.length() - 1);
    }

    @legend(createdDate = "15/03/2019", author = "Vivek", context = "Append * between pairs", returnValue = "String")
    static String pairStar(String str) {
        if (str.length() < 2) return str;
        return str.charAt(str.length() - 2) == str.charAt(str.length() - 1) ? pairStar(str.substring(0, str.length() - 1)) + ("*" + str.charAt(str.length() - 1)) : (pairStar(str.substring(0, str.length() - 1)) + str.charAt(str.length() - 1));
    }

    @legend(createdDate = "15/03/2019", author = "Vivek", context = "Move all x to the end", returnValue = "String")
    static String endX(String str) {
        if (str.length() <= 0) return str;
        return str.charAt(0) == 'x' ? endX(str.substring(1)) + str.charAt(0) : str.charAt(0) + endX(str.substring(1));
    }

    @legend(createdDate = "15/03/2019", author = "Vivek", context = "Count pairs", returnValue = "int")
    static int countPairs(String str) {
        if (str.length() < 3) return 0;
        return str.charAt(0) == str.charAt(2) ? 1 + countPairs(str.substring(1)) : countPairs(str.substring(1));
    }

    @legend(createdDate = "15/03/2019", author = "Vivek", context = "Count abc or aba", returnValue = "int")
    static int countAbc(String str) {
        if (str.length() < 3) return 0;
        else {
            String value = str.charAt(0) + "" + str.charAt(1) + "" + str.charAt(2);
            return (value.equals("abc") || value.equals("aba") ? 1 : 0) + countAbc(str.substring(1));
        }
    }

    @legend(createdDate = "15/03/2019", author = "Vivek", context = "Count 11", returnValue = "int")
    static int count11(String str) {
        if (str.length() < 2) return 0;
        return (str.charAt(0) + "" + str.charAt(1)).equals("11") ? 1 + count11(str.substring(2)) : count11(str.substring(1));
    }
}
