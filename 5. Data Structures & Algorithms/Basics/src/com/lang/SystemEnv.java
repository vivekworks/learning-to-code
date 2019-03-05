package com.lang;

import java.io.Console;
import java.util.*;


public class SystemEnv {
    void envCheck(){
        int[] arr = {1,2,3,4};
        int[] arr2=new int[2];
        System.arraycopy(arr,2,arr2,0,2);
        System.out.println(Arrays.toString(arr2));
        byte[] a = {97,98,99,100,101};
        byte[] b = {65,66,67,68,69};
        String aa = new String(a);
        String bb = new String(b);
        System.out.println(aa+" : "+bb);
        System.arraycopy(a,2,b,2,3);
        System.arraycopy(b,2,a,2,3);
        aa = new String(a);
        bb = new String(b);
        System.out.println(Arrays.toString(b));
        System.out.println(aa+" : "+bb);
        Iterator iterator = System.getenv().entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> o = (Map.Entry<String, String>) iterator.next();
            System.out.println(o.getKey()+" : "+o.getValue());
        }
        Console console = System.console();
        System.out.println(console);
        System.exit(0);
        System.Logger logger = System.getLogger("C:\\Users\\VivekTS\\Desktop\\log.txt");
        logger.log(System.Logger.Level.WARNING,"Hi");
    }

    void programRunningTime(){
        long initial = System.nanoTime();
        for(int i=0;i<1000000000L;i++);
        System.out.println(System.nanoTime() - initial);
    }

    void systemProperties(){
        Properties properties = System.getProperties();
        Set<String> propNames = properties.stringPropertyNames();
        for(String prop :propNames){
            System.out.println(prop+" : "+System.getProperty(prop));
        }
    }
}
