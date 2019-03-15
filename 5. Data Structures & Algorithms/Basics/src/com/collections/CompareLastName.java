package com.collections;

import java.util.Comparator;

public class CompareLastName implements Comparator<String> {
    public int compare(String s1, String s2){
        return s1.substring(s1.lastIndexOf(' ')).compareToIgnoreCase(s2.substring(s2.lastIndexOf(' ')));
    }
}
