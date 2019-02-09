package com.topics;

public class Thread1{
    synchronized void gig(Thread2 thread2){
        System.out.println("Thread1 gig");
        thread2.last();
    }

    synchronized void last(){
        System.out.println("Thread1 Last");
    }
}
