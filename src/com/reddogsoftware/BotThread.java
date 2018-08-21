package com.reddogsoftware;
import java.io.IOException;


class BotThread implements Runnable {
    private static final String scriptPath = "c:\\\\development\\\\pycraft\\\\starcraft_bot\\main.py";
    public void run() {
        try {
            this.runPython();
        } catch (IOException e) {
            System.out.println("IO Exception thread");
        } catch (InterruptedException e) {
            System.out.println("Interrupted thread");
        }
    }

    private void runPython() throws IOException, InterruptedException {
        ProcessBuilder pb = new ProcessBuilder("python", scriptPath);
        Process p = pb.start();
        p.waitFor();
        this.runPython();
    }
}
