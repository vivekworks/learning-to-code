package com.collections;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    static void check(){
        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A","Anjaneya");
        linkedHashMap.put("B","Buddha");
        linkedHashMap.put("C","Carl");
        System.out.println(linkedHashMap);
        linkedHashMap.get("A");
        System.out.println(linkedHashMap);
        linkedHashMap=new LinkedHashMap<>(16,0.75F,true);
        linkedHashMap.put("C","Carl");
        linkedHashMap.put("A","Anjaneya");
        linkedHashMap.put("B","Buddha");
        System.out.println(linkedHashMap);
        linkedHashMap.get("A");
        System.out.println(linkedHashMap);
    }
}
