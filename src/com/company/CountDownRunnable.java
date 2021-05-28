package com.company;

public class CountDownRunnable implements Runnable {
    @Override
    public void run() {
        int count = 10;
        for (int i = count; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Time over");
    }
}
