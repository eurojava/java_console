/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;


public class NumberPrinterThread extends Thread {

    private String threadName;
    private int number = 10;
    private int delay;

    public NumberPrinterThread(String threadName, int delay) {
        this.threadName = threadName;
        this.delay = delay;
    }

    public void run() {
        for (int i = 0; i < number; i++) {
            System.out.println("Thread [" + threadName + "] = " + i);

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        NumberPrinterThread printerA = new NumberPrinterThread("A", 1000);
        NumberPrinterThread printerB = new NumberPrinterThread("B", 750);

        printerA.start();
        printerB.start();
    }
}
