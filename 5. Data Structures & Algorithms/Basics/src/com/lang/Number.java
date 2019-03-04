package com.lang;


import java.util.Scanner;

public class Number {
    public void operations() {
        java.lang.Double d1 = java.lang.Double.valueOf(2.3645);
        java.lang.Double d2 = java.lang.Double.valueOf("3.24545");
        System.out.println(d1 + " : " + d2 + " : " + d2.byteValue());
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        long l = Long.parseLong(input);
        System.out.println(Long.toBinaryString(l) + " : " + Long.toHexString(l) + " : " + Long.toOctalString(l));
        char[] ch = {'a', 'b', '5', '?', 'A', ' '};
        for (char val : ch) {
            System.out.println(val + " is alphabetic " + Character.isAlphabetic(val));
            System.out.println(val + " is letter " + Character.isLetter(val));
            System.out.println(val + " is digit " + Character.isDigit(val));
            System.out.println(val + " is lowercase " + Character.isLowerCase(val));
            System.out.println(val + " is whitespace " + Character.isWhitespace(val));
            System.out.println(val + " is uppercase " + Character.isUpperCase(val));
        }
        System.out.println(Character.forDigit(15,16)+" : "+Character.forDigit(7,8)+" : "+Character.forDigit(8,10)+" : "+Character.forDigit(35,36));
        System.out.println(Character.isDigit(48)+" : "+Character.isDigit(37)+" : "+Character.isDigit(81)+" : "+Character.isDigit(99));
        Boolean boo = Boolean.valueOf("false");
        System.out.println(boo);
    }
}
