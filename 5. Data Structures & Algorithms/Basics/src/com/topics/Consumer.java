package com.topics;

public class Consumer implements Runnable {
    Q q;
    Thread thread;
    Consumer(Q q){
        this.q = q;
        thread = new Thread(this,"Consumer");
    }
    @Override
    public void run() {
        while (true){
            q.get();
        }
    }
}
