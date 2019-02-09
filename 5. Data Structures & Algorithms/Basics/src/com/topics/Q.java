package com.topics;

public class Q {
    int n;
    boolean valueSet = false;

    public synchronized int get() {
        while (!valueSet)
            try {
                System.out.println("Get Wait gonna start");
                wait();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        valueSet = false;
        notify();
        System.out.println("Get notified");
        System.out.println("Got : " + n);
        return n;
    }

    public synchronized void put(int n) {
        while (valueSet)
            try {
                System.out.println("Put Wait gonna start");
                wait();
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        System.out.println("Put Wait over");
        this.n = n;
        System.out.println("Put : " + n);
        valueSet = true;
        notify();
        System.out.println("Put notified");

    }
}
