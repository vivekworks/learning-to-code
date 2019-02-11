package com.threadcheck;

import java.util.Scanner;

public class NewThreadTwo implements Runnable {
    String threadName;
    Thread thread;
    Sync sync;
    NewThreadTwo(String threadName, Sync sync){
        this.threadName=threadName;
        this.sync=sync;
        thread = new Thread(this,threadName);
    }
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        /*for(int i=0;i<3;i++){
            System.out.println(threadName+" : "+i);
            try {
                Thread.sleep(200);
            }catch (InterruptedException ie){
                System.out.println(threadName+" got interrupted");
            }
        }*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Thread Two");
        scan.nextLine();
        System.out.println("Enter pressed");
        notify();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie){
            System.out.println(threadName+" got interrupted");
        }
    }
}
