package com.dsa.section1;

public class BitwiseOperations {
    public static void main(String[] args){

        int a =10;
        int b =20;

        //Bitwise AND (&)
        //a - 0000 1010
        //b - 0001 0100
        //----------------
        //    0000 0000      ==> 0
        //----------------
        System.out.println("AND : "+(a&b));

        //Bitwise OR (|)
        //a - 0000 1010
        //b - 0001 0100
        //----------------
        //    0001 1110      ==> 30
        //----------------
        System.out.println("OR : "+(a|b));

        //Bitwise XOR (^)
        //a - 0000 1010
        //b - 0001 0100
        //----------------
        //    0001 1110      ==> 30
        //----------------
        System.out.println("XOR : "+(a^b));

        //Bitwise Complement (~)
        //a - 1010
        //----------------
        //    0101
        //    1010
        //      +1
        //----------------
        //    1011         ==> -11
        //----------------
        System.out.println("One's complement a : "+(~a));

        //b - 10100
        //----------------
        //    01011
        //    10100
        //       +1
        //----------------
        //    10101        ==> -21
        //----------------
        System.out.println("One's complement b : "+(~b));
    }
}
