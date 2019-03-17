package com.utils;

import java.util.ListResourceBundle;

public class SampleRB_ru extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        Object[][] resources = new Object[3][1];
        resources[0][0] = "Java";
        resources[0][1] = "первый язык";
        resources[1][0] = "JavaScript";
        resources[1][1] = "язык браузера";
        resources[2][0] = "Python";
        resources[2][1] = "удивительный язык";
        return resources;
    }
}
