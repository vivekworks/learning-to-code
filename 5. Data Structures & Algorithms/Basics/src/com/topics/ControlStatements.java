package com.topics;

public class ControlStatements {
    private int loop;
    public ControlStatements(int loop){
        this.loop = loop;
    }
    public void runStatements() {
        int l, y;
        l = 0;
        if (l < 10)
            if (true) {
                System.out.println("furore");
            } else System.out.println("error");
    }
    public void finalCheck(final int a){
        //a = 10;
    }
}
