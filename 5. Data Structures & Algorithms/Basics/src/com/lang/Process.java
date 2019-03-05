package com.lang;

import java.io.*;

public class Process {
    public void processOperations() {
        System.out.println(Void.TYPE.getName());
    }

    public void memoryManagement() {
        Runtime runtime = Runtime.getRuntime();
        long mem1, mem2, mem3, mem4;
        Integer[] ints = new Integer[1000];
        System.out.println("Total Memory Available : " + runtime.totalMemory());
        mem1 = runtime.freeMemory();
        System.out.println("Free Memory Available : " + mem1);
        runtime.gc();
        System.out.println("Total Memory Available after GC : " + runtime.totalMemory());
        mem2 = runtime.freeMemory();
        System.out.println("Free Memory Available after GC : " + mem2);
        System.out.println("Memory Cleared by GC : " + (mem1 - mem2));
        for (int i = 0; i < 1000; i++)
            ints[i] = i;
        System.out.println("Total Memory Available after Array : " + runtime.totalMemory());
        mem3 = runtime.freeMemory();
        System.out.println("Free Memory Available after Array : " + mem3);
        for (int i = 0; i < 1000; i++)
            ints[i] = null;
        runtime.gc();
        System.out.println("Total Memory Available after Array Discard & GC : " + runtime.totalMemory());
        System.gc();
        System.out.println("Total Memory Available after Array Discard & GC : " + runtime.totalMemory());
        mem4 = runtime.freeMemory();
        System.out.println("Free Memory Available after Array Discard & GC : " + mem4);
    }

    public void executeOtherPrograms() throws IOException, InterruptedException {
        Runtime runtime = Runtime.getRuntime();
        java.lang.Process p = runtime.exec("notepad");
        OutputStream opStream = p.getOutputStream();
        InputStream ipStream = p.getInputStream();
        //try (PrintWriter printWriter = new PrintWriter(p.getOutputStream(),true)) {
        PrintWriter printWriter = null;
        FileOutputStream fos = null;
        BufferedReader reader = null;
        try {
            printWriter = new PrintWriter(opStream);
            printWriter.println("Timmy the man");
            printWriter.flush();
            printWriter.close();
            reader = new BufferedReader(new InputStreamReader(ipStream));
            reader.close();
        } finally {
            if (printWriter != null) printWriter.close();
            if (reader != null) reader.close();
        }
        Thread.sleep(1000);
        p.destroy();
        //p.waitFor();
        System.out.println("Exit value : " + p.exitValue());
    }

    public void runtimeVersion() {
        Runtime.Version rtv = Runtime.version();
        System.out.println(rtv);
        System.out.println(rtv.build().get());
        System.out.println(rtv.patch());
        System.out.println(rtv.feature());
        System.out.println(rtv.interim());
        System.out.println(rtv.update());
    }

    public void buildProcesses() throws IOException{
        ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe","test");
        processBuilder.start();
    }
}
