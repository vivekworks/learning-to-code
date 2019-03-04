package com.lang;

public class Process {
    public void processOperations(){
        System.out.println(Void.TYPE.getName());
    }

    public void memoryManagement(){
        Runtime runtime = Runtime.getRuntime();
        long mem1,mem2,mem3,mem4;
        Integer[] ints = new Integer[1000];
        System.out.println("Total Memory Available : "+runtime.totalMemory());
        mem1 = runtime.freeMemory();
        System.out.println("Free Memory Available : "+mem1);
        runtime.gc();
        mem2 = runtime.freeMemory();
        System.out.println("Free Memory Available after GC : "+mem2);
        System.out.println("Memory Cleared by GC : "+(mem1-mem2));
        for(int i=0;i<1000;i++)
            ints[i]=i;
        mem3 = runtime.freeMemory();
        System.out.println("Free Memory Available after Array: "+mem3);
        System.out.println("Memory Used By Array Allocation: "+(mem3-mem2));
        for(int i=0;i<1000;i++)
            ints[i]=null;
        runtime.gc();
        mem4 = runtime.freeMemory();
        System.out.println("Free Memory Available after Array Discard: "+mem4);
        System.out.println("Memory Cleared by GC : "+(mem3-mem2));
    }
}
