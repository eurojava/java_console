/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

public class DaemonThread implements Runnable {

    private String threadName;

    DaemonThread(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        System.out.println("Running [" + threadName + "]");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new DaemonThread("I Thread"));
        Thread t2 = new Thread(new DaemonThread("II Thread"));

        //
        t1.setDaemon(true);
        t1.start();

        //
        t2.start();
    }
}
