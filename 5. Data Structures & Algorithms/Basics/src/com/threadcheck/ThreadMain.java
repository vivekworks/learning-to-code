package com.threadcheck;

public class ThreadMain {
    static boolean threadStatus;
    public static void main(String[] args){
        Sync sync = new Sync();
        NewThreadOne threadOne = new NewThreadOne("One",sync);
        NewThreadOne threadTwo = new NewThreadOne("Two",sync);
        threadOne.thread.start();
        threadTwo.thread.start();
        try{
            if(threadOne.thread.isAlive())
                threadOne.thread.join();
            if(threadTwo.thread.isAlive())
                threadTwo.thread.join();
        } catch (InterruptedException ie){
            System.out.println("Waiting for threads to join");
        }
        if(!threadOne.thread.isAlive() && !threadTwo.thread.isAlive())
            System.out.println();
    }
}
