package com.threadcheck;

public class Sync {
    int count;
    boolean set = false;

    public synchronized void threadOneAction() {
        while (set) {
            System.out.println("Inside ThreadOneAction : " + set);
            try {
                System.out.println("Gonna start waiting : One");
                wait();
                System.out.println("Wait over : One");
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        count++;
        System.out.println("Set : " + count);
        set = true;
        System.out.println("Gonna start notify : One");
        notify();
        System.out.println("Notified : One");
    }

    public synchronized void threadTwoAction() {
        while (!set) {
            System.out.println("Inside ThreadTwoAction : " + set);
            try {
                System.out.println("Gonna start waiting : Two");
                wait();
                System.out.println("Wait over : Two");
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
        System.out.println("Get : " + count);
        set = false;
        System.out.println("Gonna start notify : Two");
        notify();
        System.out.println("Notified : Two");
    }
}