package com.javaio;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import static java.lang.System.out;

public class FileDemo {
    FileDemo() throws IOException {
        File file = new File(System.getProperty("user.dir")+"\\Basics\\src\\com\\javaio\\file2.txt");
        out.println("Name : "+file.getName());
        out.println("Path : "+file.getPath());
        out.println("Absolute path : "+file.getAbsolutePath());
        out.println("Parent : "+file.getParent());
        out.println("Canonical Path : "+file.getCanonicalPath());
        out.println(file.exists() ? "exists" : "don't exist");
        out.println(file.canWrite() ? "can write" : "can't write");
        out.println(file.canRead() ? "can read" : "can't read");
        out.println("is directory : "+(file.isDirectory() ? "yes":"no"));
        out.println("is file : "+(file.isFile()?"yes" : "no"));
        out.println("is absolute : "+(file.isAbsolute() ? "yes":"no"));
        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(file.lastModified());
        out.println("last modified : "+ cal.getTime());
        out.println("file size : "+file.length());
        out.println(file.delete());
        out.println(file.renameTo(new File(file.getParent()+"\\file1.txt")));
    }
}
