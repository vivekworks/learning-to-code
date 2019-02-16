package com.io;

import java.io.IOException;

public class ConsoleInputMain {
    public static void main(String[] args) throws IOException {
        try {
            ReadConsole readConsole = new ReadConsole();
            readConsole.getInput();
        } catch (Exception e) {
            throw e;
        }
    }
}
