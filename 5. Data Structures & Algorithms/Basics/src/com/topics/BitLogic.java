package com.topics;

public class BitLogic {
    public void bitProcessing() {
        int a = 0b0011;
        int b = 0b0110;
        int c = a | b;
        System.out.println("C = " + c);
        int d = a & b;
        System.out.println("D = " + d);
        int e = a ^ b;
        System.out.println("E = "+e);
        int f = (~a & b)|(a & ~b);
        System.out.println("F = "+f);
        int g = (~a & 0x1f);
        System.out.println("G = "+g);
        int h = a << 2;
        System.out.println("H = "+h);
        int i = a >> 2;
        System.out.println("I = "+i);
        int j = -8;//0b11111000
        System.out.println("J = "+j);
        int k = j >>1;
        System.out.println("K = "+k);
        int l = -1;
        int m = l >>> 24;
        System.out.println("M = "+m);
        int n = 1;
        int o = 2;
        int p = 3;
        n |= 4;
        System.out.println("N = "+n);
        o >>= 1;
        p <<= 1;
        n ^= p;
        System.out.println("N = "+n);
        System.out.println("O = "+o);
        System.out.println("P = "+p);
        int den = 0;
        int num = 5;
        if(den != 0 & num/den != 0){
            System.out.println("Dens");
        } else{
            System.out.println("Nums");
        }
    }
}
