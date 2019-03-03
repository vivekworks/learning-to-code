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
        byte[] by = b.getBytes();
        System.out.println(Arrays.toString(c)+" - "+Arrays.toString(d)+" - " +a+" - "+Arrays.toString(by));
    }

    void stringComparison(){
        String a = "Hellow";
        String b = "HELLOW";
        String c = "Marshmellow";
        System.out.println(a.equals(b)+" - "+a.equalsIgnoreCase(b));
        System.out.println(a.regionMatches(1,c,6,5)+" - "+b.regionMatches(1,c,6,5)+" - "+b.regionMatches(true,1,c,6,5));
        System.out.println(a.startsWith("H")+" - "+b.endsWith("LOW")+" - "+b.startsWith("ELL",1));
        String d = "CardiB";
        String e = "CardiB";
        String f= d;
        String g = new String(f);
        System.out.println(d.equals(e)+" : "+(d==e)+" : "+d.equals(f)+" : "+(f==d)+" : "+(f.equals(g))+" : "+(f==g));
        String h = "Bruno Mars";
        String i = "Bruno mars";
        System.out.println(h.compareTo(i)+" ; "+h.compareToIgnoreCase(i));
    }

    void stringSearch(){
        String a = " day It's gay wonderful day";
        System.out.println(a.indexOf('f')+" : "+a.indexOf("'s")+" : "+a.indexOf("a",3)+" : "+a.indexOf("a"));
        System.out.println(a.lastIndexOf(" day")+" : "+a.lastIndexOf("day",10));
    }

    void stringModification(){
        String a = "Data Structures And Algorithms";
        String b = a.substring(5,15);
        String c = a.substring(20);
        String d = a.concat(b);
        String e = a+b;
        String f = a.replace('c','k');
        String g = a.replace("ture","toure");
        char ch = '\u2000';
        String h = ch+g+ch;
        System.out.println(b+" : "+c);
        System.out.println(d+" : "+e);
        System.out.println(f+" : "+g);
        System.out.println(h.trim()+" : "+h.strip());
        System.out.println(h.stripLeading()+" : "+h.stripTrailing());
    }

    void valueOfConversion(){
        int a = 100;
        byte b = 20;
        char c = 'g';
        float f = 3.52F;
        long l = 979L;
        double d = 999;
        int[] inCh = {2,4,5,6};
        char[] chCh = {'a','b','c','d','e','f'};
        System.out.println(String.valueOf(a));
        System.out.println(String.valueOf(b));
        System.out.println(String.valueOf(c));
        System.out.println(String.valueOf(f));
        System.out.println(String.valueOf(l));
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(inCh));
        System.out.println(String.valueOf(chCh));
        System.out.println(String.valueOf(new StringConversion()));
        System.out.println(String.valueOf(chCh,3,2));
    }

    void caseChange(){
        String a = "vaish";
        String b = "VAISH";
        System.out.println(a.toUpperCase()+" : "+b.toLowerCase());
    }

    void joiningStrings(){
        String a= "Apples";
        String b= "Oranges";
        String c= "Bananas";
        String d= "Pineapples";
        System.out.println(String.join(";",a,b,c,d));
    }

    public String toString(){
        return "Contains the basic operations of StringConversion Class";
    }
}
