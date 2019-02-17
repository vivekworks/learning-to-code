package com.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class WriteFile {
    void writeFile() throws IOException {
        String userDirectory = System.getProperty("user.dir");
        File file = new File(userDirectory + "\\Basics\\src\\com\\io\\file2.txt");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            ReadFile readFile = new ReadFile();
            String data = readFile.readFile();
            for(char c :data.toCharArray()){
                fos.write(c);
            }
        } finally {
            if(fos!=null)
                fos.close();
        }

    }
}
