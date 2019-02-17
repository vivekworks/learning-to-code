package com.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class ReadFile {
    private String data="";
    String readFile() throws IOException {
        String userDirectory = System.getProperty("user.dir");
        File file = new File(userDirectory + "\\Basics\\src\\com\\io\\file1.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            int c;
            do {
                c = fis.read();
                data+=(char)c;
                System.out.print((char) c);
            } while (c != -1);
        } finally {
            if (fis != null)
                fis.close();
        }
        return data;
    }
}
