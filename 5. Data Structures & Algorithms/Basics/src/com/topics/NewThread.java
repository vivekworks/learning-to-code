package com.topics;

public class NewThread implements Runnable{
    public Thread thread;
    public Recursion recurs;
    public NewThread(String threadName, Recursion recurs){
        thread = new Thread(this, threadName);
        this.recurs=recurs;
    }
    public void run(){
        synchronized (this.recurs) {
            recurs.meth();
        }
    }
}