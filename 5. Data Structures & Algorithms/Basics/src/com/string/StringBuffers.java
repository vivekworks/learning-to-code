package com.string;

public class StringBuffers {
    void constructors(){
        StringBuffer strBuff1 = new StringBuffer();
        StringBuffer strBuff2 = new StringBuffer(2);
        StringBuffer strBuff3 = new StringBuffer("Buffet");
        CharSequence ch = "dfhd";
        StringBuffer strBuff4 = new StringBuffer(ch);
        System.out.println(strBuff1+" : "+strBuff2+" : "+strBuff3+" : "+strBuff4);
    }

    void bufferSize(){
        StringBuffer sBuff1 = new StringBuffer();
        StringBuffer sBuff2 = new StringBuffer("Hey");
        System.out.println(sBuff1.length()+" : "+sBuff1.capacity());
        System.out.println(sBuff2.length()+" : "+sBuff2.capacity());
        sBuff1.ensureCapacity(27);
        System.out.println(sBuff1.length()+" : "+sBuff1.capacity());
        sBuff2.setLength(15);
        System.out.println(sBuff2+" : "+sBuff2.length()+" : "+sBuff2.capacity());
        sBuff2.setLength(2);
        System.out.println(sBuff2+" : "+sBuff2.length()+" : "+sBuff2.capacity());
    }

    void bufferCharacters(){
        StringBuffer a = new StringBuffer("Hi");
        System.out.println(a.charAt(1));
        a.setCharAt(1,'k');
        System.out.println(a);
        char[] ch = new char[a.length()];
        a.getChars(0,2,ch,0);
        System.out.println(ch);
        StringBuffer b = new StringBuffer("Hello");
        a.append(b);
        System.out.println(a);
        a.insert(2,"Everyone");
        System.out.println(a);
        a.reverse();
        System.out.println(a);
        a.replace(13,14,"i");
        System.out.println(a);
        String c = a.substring(3);
        System.out.println(c);
        c= a.substring(0,2);
        System.out.println(c);
        StringBuffer sb1 = new StringBuffer("one two one");
        System.out.println(sb1.indexOf("one")+" : "+sb1.lastIndexOf("one"));
        a.delete(0,2);
        System.out.println(a);
        a.deleteCharAt(2);
        System.out.println(a);
    }
}
