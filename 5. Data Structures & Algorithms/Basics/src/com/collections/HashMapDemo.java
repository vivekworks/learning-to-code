package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    static void check(){
        HashMap<String, Double> marksMap = new HashMap<>();
        marksMap.put("Anish",50.0);
        marksMap.put("Ashok",47.0);
        marksMap.put("Gopinath",43.9);
        marksMap.put("Kannan",59.0);
        System.out.println(marksMap);
        System.out.println(marksMap.values());
        System.out.println(marksMap.keySet());
        System.out.println(marksMap.entrySet());
        for(Map.Entry<String,Double> entry :marksMap.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
            entry.setValue(52.6);
        }
        System.out.println(marksMap);
        long a = System.nanoTime();
        marksMap.get("Ashok");
        long b = System.nanoTime();
        System.out.println((b-a));
    }
}
