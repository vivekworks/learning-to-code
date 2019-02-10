package com.topics;

public class SuspendResume implements Runnable {
    Thread thread;
    String name;
    boolean suspendFlag;
    SuspendResume(String threadName){
        this.name=threadName;
        thread = new Thread(this,name);
        System.out.println("New Thread : "+thread);
        suspendFlag = false;
    }
    @Override
    public void run() {
        try{
            for(int i=0;i<15;i++) {
                System.out.println(name+" : "+i);
                System.out.println(name+" gonna sleep");
                Thread.sleep(200);
                System.out.println(name+" woke up");
                synchronized (this){
                    while (suspendFlag) {
                        System.out.println(name+" gonna begin");
                        wait();
                        System.out.println(name+" continues");
                    }
                }
            }
        } catch (InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println(name+" exiting");
    }

    synchronized void suspend(){
        suspendFlag=true;
    }

    synchronized void resume(){
        suspendFlag=false;
        notify();
    }
}
