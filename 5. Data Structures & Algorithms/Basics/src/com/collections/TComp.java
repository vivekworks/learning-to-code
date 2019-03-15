package com.collections;

import java.util.Comparator;

public class TComp implements Comparator<String> {
    public int compare(String str1, String str2){
        int k=str1.substring(str1.lastIndexOf(' ')).compareToIgnoreCase(str2.substring(str2.lastIndexOf(' ')));
        if(k==0)
            return str1.compareToIgnoreCase(str2);
        else
            return k;
    }
}
