package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadConsole {
    public void getInput() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader buffRead = new BufferedReader(isr);
        char c;
        System.out.println("Enter characters, q to quit");
        c = (char) buffRead.read();
        do {
            c = (char) buffRead.read();
            System.out.println(c);
        } while (c != '\n');
    }
}
