package com.reddogsoftware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.InterruptedException;
import java.lang.ProcessBuilder;

class BotThread implements Runnable {
    private static final String pythonExecutable = "C:/Users/Captobviouz/Anaconda3/python.exe";
    private static final String scriptPath = "C:/Development/pycraft/starcraft_bot/main.py";

    public void run() {
        try {
            this.runPython();
        } catch (IOException e) {
            System.out.println("IO Exception");
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    private void runPython() throws IOException, InterruptedException {
        System.out.println("Calling runPython");
        ProcessBuilder pb = new ProcessBuilder(pythonExecutable, scriptPath);
        Process p = pb.start();
        BufferedReader bfr = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = "";
        System.out.println("Running Python starts: " + line);
        int exitCode = p.waitFor();
        System.out.println("Exit Code : " + exitCode);
        line = bfr.readLine();
        System.out.println("First Line: " + line);
        while ((line = bfr.readLine()) != null) {
            System.out.println("Python Output: " + line);


        }
        this.runPython();
    }
}
