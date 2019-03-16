package com.utils;

import java.util.BitSet;

public class BitSetDemo {
    static void utilize(){
        BitSet bs1 = new BitSet();
        BitSet bs2 = new BitSet();
        for(int i=0;i<20;i=i+2)
            bs1.set(i);
        for(int i=0;i<10;++i)
            bs2.set(i);
        System.out.println(bs1);
        System.out.println(bs2);
        bs1.and(bs2);
        System.out.println(bs1);
        bs2.xor(bs1);
        System.out.println(bs2);
    }
}
