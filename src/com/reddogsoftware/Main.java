package com.reddogsoftware;

public class Main {

    public static void main(String[] args) {
        BotThread botThread = new BotThread();
        Thread t = new Thread(botThread);
        t.start();
    }
}
