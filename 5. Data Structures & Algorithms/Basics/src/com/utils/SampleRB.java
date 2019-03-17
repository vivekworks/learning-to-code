package com.utils;

import java.util.ListResourceBundle;

public class SampleRB extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        Object[][] resources = new Object[3][1];
        resources[0][0] = "Java";
        resources[0][1] = "First Language";
        resources[1][0] = "JavaScript";
        resources[1][1] = "Browser Language";
        resources[2][0] = "Python";
        resources[2][1] = "Amazing Language";
        return resources;
    }
}
