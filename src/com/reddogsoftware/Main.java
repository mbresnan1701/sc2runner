package com.reddogsoftware;

public class Main {
    private static final int maxThreads = 10;
    public static void main(String[] args) {
        for(int i = 0; i < maxThreads; i++) {
            BotThread botThread = new BotThread();
            Thread t = new Thread(botThread);
            t.start();
        }
    }
}
