package com.utils;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Topics {
    static void randomUtilize() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++)
            System.out.println(rand.nextInt());
    }

    static void timerUtilize(){
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Timer task executed");
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask,1000,500);
        try {
            Thread.sleep(5000);
        } catch (Exception e){
            e.printStackTrace();
        }
        timer.cancel();
    }
}
