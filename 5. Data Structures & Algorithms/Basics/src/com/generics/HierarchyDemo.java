package com.generics;



import java.util.ArrayList;
import java.util.List;

public class HierarchyDemo {
    void showDemo(){
        GenSuperClass<Integer> genSuperInt = new GenSuperClass<>(2);
        //GenSubClass<Integer> genSubInt = new GenSubClass<>(2);
        GenSuperClass<String> genSuperStr = new GenSuperClass<>("String");
       // GenSubClass<String> genSubStr = new GenSubClass<>("String");
        System.out.println(genSuperInt instanceof GenSuperClass<?>);
  //      System.out.println(genSuperInt instanceof GenSubClass<?>);
       // System.out.println(genSubInt instanceof GenSubClass<?>);
     //   System.out.println(genSubInt instanceof GenSuperClass<?>);
        System.out.println(genSuperStr instanceof GenSuperClass<?>);
      //  System.out.println(genSubStr instanceof GenSubClass<?>);
        genSuperInt.getOb();
      //  genSubStr.getOb();
        var o = new GenSuperClass<>(2);
        GenSuperClass<?>[] genSuperClass = new GenSuperClass<?>[10];
        //List<String>[] lsa = new List<String>[10]; // illegal
        List<?>[] lsa = new List<?>[10]; // Wildcard
        Object[] oa = lsa;  // OK because List<String> is a subtype of Object
        List<Integer> li = new ArrayList<>();
        li.add(3);
        oa[0] = li;
        //String s = lsa[0].get(0);//Can't be compiled if wildcards are used in line25 instead of line24
    }
}
