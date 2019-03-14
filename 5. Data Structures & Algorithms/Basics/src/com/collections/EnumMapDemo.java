package com.collections;

import java.util.EnumMap;

public class EnumMapDemo {
    static void check(){
        EnumMap<Gods,Integer> godsEnumMap = new EnumMap<>(Gods.class);
        godsEnumMap.put(Gods.Shiva,Gods.Shiva.getGodOrder());
        godsEnumMap.put(Gods.Vishnu,Gods.Vishnu.getGodOrder());
        godsEnumMap.put(Gods.Ganesh,Gods.Ganesh.getGodOrder());
        godsEnumMap.put(Gods.Ayyappa,Gods.Ayyappa.getGodOrder());
        godsEnumMap.put(Gods.Karthik,Gods.Karthik.getGodOrder());
        System.out.println(godsEnumMap);
    }
}
