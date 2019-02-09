package com.topics;

public class NewThread2 extends Thread {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("New Thread2 : "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie){
                System.out.println("New Thread2 implemented");
            }
        }
    }
}
