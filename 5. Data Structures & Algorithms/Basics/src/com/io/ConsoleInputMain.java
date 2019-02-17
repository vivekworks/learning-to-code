package com.io;

import java.io.IOException;

public class ConsoleInputMain {
    public static void main(String[] args) throws IOException{
        try {
            ReadConsole readConsole = new ReadConsole();
            //readConsole.getInput();
            WriteConsole writeConsole = new WriteConsole();
            //writeConsole.showOutput();
            ReadFile readFile = new ReadFile();
            //readFile.readFile();
            WriteFile writeFile=new WriteFile();
            //writeFile.writeFile();
            ReadAndWrite readAndWrite = new ReadAndWrite();
            readAndWrite.readWrite();
        } catch (Exception e) {
            throw e;
        }
    }
}
