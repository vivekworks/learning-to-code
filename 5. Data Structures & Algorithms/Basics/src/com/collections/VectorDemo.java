package com.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    static void check(){
        Vector<String> stringVector = new Vector<>();
        stringVector.add("A");
        stringVector.add("E");
        stringVector.add("I");
        stringVector.add("O");
        stringVector.add("U");
        System.out.println(stringVector);
        Enumeration<String> vectorEnumerate = stringVector.elements();
        while (vectorEnumerate.hasMoreElements()){
            System.out.println(vectorEnumerate.nextElement());
        }
    }
}
