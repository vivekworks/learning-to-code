package com.topics;

public class Recursion {
    private String word;

    public Recursion() {

    }

    public Recursion(String word) {
        this.word = word;
    }

    private void printReverse(int index) {
        if (index < 0) return;
        System.out.print(word.charAt(index));
        printReverse(index - 1);
        //Interface.much();
        //int b = a;
    }

    public interface goonie {
        void munch();
    }

    public void meth() {
        System.out.print("[" + Thread.currentThread().getName()+" , ");
        try {
            System.out.print(Thread.currentThread().getName()+" Before sleep , ");
            Thread.sleep(1000);
            System.out.print(Thread.currentThread().getName()+" After sleep ");
        } catch (InterruptedException ie) {
            System.out.println("New Thread Interrupted");
        }
        System.out.println("]");
    }
}
