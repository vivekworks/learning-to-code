package com.collections;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    static void check(){
        Properties properties = new Properties();
        properties.put("JVM","1");
        properties.put("JRE","2");
        properties.put("JDK","3");
        for(Map.Entry<Object, Object> val :properties.entrySet()){
            System.out.println(val.getKey()+" : "+val.getValue());
        }
        for(String value :properties.stringPropertyNames()){
            System.out.println(value);
        }
    }
}
