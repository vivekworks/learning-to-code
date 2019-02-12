package com.topics;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;

@Retention(RetentionPolicy.RUNTIME)
@interface Anno{
    int val();
    String post();
}

public class Annotation {
    @Anno(val=7,post="Vaish")
    public void annoCheck(){
        Annotation annotation = new Annotation();
        Class<?> cla = annotation.getClass();
        System.out.println(cla);
        for(var meth :cla.getMethods()){
            System.out.println(meth);
            System.out.println(meth.getAnnotation(Anno.class)+" - "+meth.getAnnotation(Anno.class).val()+" - "+meth.getAnnotation(Anno.class).post());
        }
    }
}
