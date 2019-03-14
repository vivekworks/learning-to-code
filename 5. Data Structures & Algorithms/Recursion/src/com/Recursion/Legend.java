package com.Recursion;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface legend{
    String createdDate();
    String author();
    String context();
    String returnValue();
}

