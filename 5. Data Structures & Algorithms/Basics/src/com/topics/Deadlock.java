package com.topics;

public class Deadlock implements Runnable {
    Deadlock(){
        thread1 = new Thread1();
        thread2 = new Thread2();
    }
    Thread1 thread1; Thread2 thread2;
    @Override
    public void run() {
        thread1.gig(thread2);
        callOtherOne();
    }

    public void callOtherOne(){
        thread2.gig(thread1);
    }

    public void startLock(){
        new Thread(this).start();
        callOtherOne();
    }
}
