package com.string;

import java.util.Arrays;

public class StringConversion {
    void basicOperations(){
        String s0 = new String();//Default constructor
        char[] c = {'S','t','r','i','n','g'};
        String s1 = new String(c);
        String s2 = new String(s1);
        c[3]='u';
        String s3 = new String(c);
        String s4 = new String(c,2,4);
        byte[] byteArr = {97,98,99,100,101};
        String s5 = new String(byteArr);
        int o=s5.length();
        int o1="Heyji".length();
        String c1 = "hmmm"+"alright";
        String c2=c1+o;
        String c3 = c1+o+o;
        String c4 = c3+(o+o);
        System.out.println(s0+" - "+s1+" - "+s2+" - "+s3+" - "+s4+" - "+s5);
        System.out.println(o+" - "+o1+" - "+c1+" - "+c2+" - "+c3+" - "+c4);
        String c10 = String.valueOf(o);
        String c11 = String.valueOf(new StringConversion());
        System.out.println(c10+" - "+c11);
    }

    void characterExtraction(){
        String b = "Strings";
        char a = b.charAt(1);
        char[] c = new char[10];
        b.getChars(0,7,c,0);
        char[] d = b.toCharArray();
        System.out.println(Arrays.toString(c)+" - "+Arrays.toString(d)+" - " +a);
    }

    public String toString(){
        return "Contains the basic operations of StringConversion Class";
    }
}
