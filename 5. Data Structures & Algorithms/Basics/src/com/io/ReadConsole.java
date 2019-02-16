package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ReadConsole {
    void getInput() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffRead = new BufferedReader(isr);
        char c;
        System.out.println("Enter characters, q to quit");
        c = (char) buffRead.read();
        System.out.println(c);
        do {
            c = (char) buffRead.read();
            System.out.println(c);
        } while (c != '\n');
        System.out.println("Enter string, q to quit");
        String s = buffRead.readLine();
        System.out.println(s);
        do{
            s=buffRead.readLine();
            System.out.println(s);
        } while (s.equals(String.valueOf('\n')));
    }
}
