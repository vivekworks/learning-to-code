package com.utils;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo {
    static void utilize() {
        try {
            Class<?> classRef = Class.forName("java.lang.System");
            System.out.println("Constructors");
            Constructor[] cons = classRef.getConstructors();
            for(Constructor c :cons){
                System.out.println(c);
            }
            System.out.println("Methods");
            Method[] meths = classRef.getMethods();
            for(Method m :meths){
                System.out.println(m);
            }
            System.out.println("Fields");
            Field[] fields = classRef.getFields();
            for(Field f :fields){
                System.out.println(f);
            }

        } catch (Exception e) {

        }
    }
}
