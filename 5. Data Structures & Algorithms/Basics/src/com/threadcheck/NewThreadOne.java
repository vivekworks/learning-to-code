package com.threadcheck;

public class NewThreadOne implements Runnable {
    String threadName;
    Thread thread;
    Sync sync;
    NewThreadOne(String threadName, Sync sync){
        this.threadName=threadName;
        this.sync =sync;
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
        int count=0;
            System.out.println("Thread One");
            try {
                wait();
            } catch (InterruptedException ie){
                System.out.println("Thread One Interrupted");
            }
            System.out.println("Wait over");
    }
}
