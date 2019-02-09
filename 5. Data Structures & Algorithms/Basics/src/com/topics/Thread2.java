package com.topics;

public class Thread2 {
    synchronized void gig(Thread1 thread1){
        System.out.println("Thread2 gig");
        thread1.last();
    }

    synchronized void last(){
        System.out.println("Thread2 Last");
    }
}
