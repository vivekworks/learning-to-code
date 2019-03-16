package com.utils;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
    static void utilize(){
        String data = "title=java the complete reference;author=herbert schildt;publisher=Oracle press;copyright=2019;";
        StringTokenizer strToken = new StringTokenizer(data,"=;");
        StringTokenizer strToken2 = new StringTokenizer(data,"=;",true);
        while(strToken.hasMoreTokens()){
            System.out.println(strToken.nextToken()+" : "+strToken.nextToken());
        }
        while(strToken2.hasMoreElements()){
            System.out.println(strToken2.nextToken()+" "+strToken2.nextToken());
        }
    }
}
