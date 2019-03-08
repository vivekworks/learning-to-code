package com.io;

import java.io.*;
import java.util.ArrayList;

import static java.lang.Math.*;

public class ReadAndWrite {
    boolean flago;
    ReadAndWrite(){
        this(true);
    }
    ReadAndWrite(boolean flag){
        this(flag,flag);
    }
    ReadAndWrite(boolean flag1,boolean flag2){
        System.out.println(flag1+" - "+flag2);
    }
    void readWrite() throws IOException {
        String line;
        String path=System.getProperty("user.dir")+"\\Basics\\src\\com\\io\\";
        BufferedReader readBuffer = new BufferedReader(new InputStreamReader(System.in));
        File newFile = new File(path+"write.txt");
        try(FileOutputStream fos = new FileOutputStream(newFile)) {
            while (!((line = readBuffer.readLine()).equals("end"))) {
                for(char c :line.toCharArray())
                    fos.write(c);
                fos.write('\n');
            }
        }
        int c;
        try(FileInputStream fis = new FileInputStream(newFile);PrintWriter writer = new PrintWriter(System.out)){
            while((c = fis.read()) != -1)
                writer.print((char)c);
            writer.flush();
        }
        int a=10;
        double b=pow(10,2);

        ReadAndWrite rw = new ReadAndWrite();
        ArrayList<ReadAndWrite> alist = new ArrayList<>();
        alist.add(rw);
        alist.add(rw);
    }
}
