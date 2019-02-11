package com.threadcheck;

public class Sync {
    public synchronized void checkSync(){
        System.out.println(Thread.currentThread().getName()+"; Name : Vivek");
        System.out.println(Thread.currentThread().getName()+"; Age : 28");
        System.out.println(Thread.currentThread().getName()+"; Status : Single");
    }
}