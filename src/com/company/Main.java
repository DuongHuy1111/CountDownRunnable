package com.company;

public class Main {

    public static void main(String[] args) {
        CountDownRunnable downRunnable = new CountDownRunnable();
        Thread thread = new Thread(downRunnable);
        thread.start();
    }
}
