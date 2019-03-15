package com.collections;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
    static void check(){
        Hashtable<String, Integer> hashTable = new Hashtable<>();
        hashTable.put("Alpha",1);
        hashTable.put("Beta",2);
        hashTable.put("Gamma",3);
        hashTable.put("Delta",4);
        System.out.println(hashTable);
        Enumeration<Integer> enums = hashTable.elements();
        while(enums.hasMoreElements()){
            Integer enumHash = enums.nextElement();
            System.out.println(enumHash);
        }
    }
}
