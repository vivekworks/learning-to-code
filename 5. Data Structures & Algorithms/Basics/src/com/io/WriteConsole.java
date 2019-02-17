package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

class WriteConsole {
    void showOutput(){
        //PrintWriter writer = new PrintWriter(System.out,false);
        BufferedWriter buffWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        PrintWriter writer=new PrintWriter(buffWriter);
        writer.println("Helloworld");
        writer.write("Helloworld");
        writer.flush();
    }
}
