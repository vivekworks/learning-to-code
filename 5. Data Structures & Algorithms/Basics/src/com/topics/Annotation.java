package com.topics;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;



@Retention(RetentionPolicy.RUNTIME)
@interface Author{
    String name();
    String date();
    String[] reviewers();
    String modifiedBy();
    String modifiedDate();
    String version();
}

public class Annotation {
    @Author(name="Vivek",date="13/02/2019",reviewers = {"Vivek","Arti"},modifiedBy = "Vivek",modifiedDate = "14/02/2019",version = "1.1")
    public void annoCheck(){
        Annotation annotation = new Annotation();
        Class<?> cla = annotation.getClass();
        System.out.println(cla);
        for(var meth :cla.getMethods()){
            System.out.println(meth);
            System.out.println(meth.getAnnotation(Author.class)+" - "+meth.getAnnotation(Author.class).name()+" - "+meth.getAnnotation(Author.class).date());
        }
    }
}
