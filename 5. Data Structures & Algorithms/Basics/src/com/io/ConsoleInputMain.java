package com.io;

import java.io.IOException;

public class ConsoleInputMain {
    public static void main(String[] args) {
        try {
            ReadConsole readConsole = new ReadConsole();
            //readConsole.getInput();
            WriteConsole writeConsole = new WriteConsole();
            writeConsole.showOutput();
            ReadFile readFile = new ReadFile();
            //readFile.readFile();
            WriteFile writeFile=new WriteFile();
            //writeFile.writeFile();
        } catch (Exception e) {
            throw e;
        }
    }
}
