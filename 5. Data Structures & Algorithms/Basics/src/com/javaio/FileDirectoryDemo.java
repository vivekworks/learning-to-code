package com.javaio;

import java.io.File;

import static java.lang.System.out;

public class FileDirectoryDemo {
    FileDirectoryDemo() {
        String dirPath = System.getProperty("user.dir") + "\\Basics\\src\\com\\javaio";
        File fileDirectory = new File(dirPath);
        if (fileDirectory.isDirectory()) {
            out.println(fileDirectory.getName() + " is a directory");
            String[] filesList = fileDirectory.list();
            String[] newFilesList = fileDirectory.list((file, name) -> name.endsWith(".txt"));
            out.println("Filtered file name " + newFilesList[0]);
            for (String file : filesList) {
                File newFile = new File(fileDirectory.getAbsolutePath() + "\\" + file);
                if (newFile.isDirectory())
                    out.println(file + " is a directory");
                else out.println(file + " is a file");
            }
        } else out.println(fileDirectory.getName() + " is a file");
        File newDir = new File(dirPath + "\\files");
        if (!newDir.exists()) {
            out.println("NewDir doesn't exist");
            if (newDir.mkdir())
                out.println("NewDir is made");
        }
        File new2Dir = new File(dirPath + "\\files\\one\\two\\three");
        if (!new2Dir.exists()) {
            out.println("New2Dir doesn't exist");
            if (!new2Dir.mkdir()) {
                out.println("New2Dir mkdir fails");
                if (new2Dir.mkdirs())
                    out.println("New2Dir mkdirs succeeds");
            }
        }
        out.println(new2Dir.getAbsolutePath());
        out.println(newDir.getAbsolutePath());
    }
}
