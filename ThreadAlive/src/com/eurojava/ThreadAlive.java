/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

/**
 *
 * @author Darek
 */
public class ThreadAlive implements Runnable {

    ThreadAlive() {
    }

    public void run() {
        System.out.println("Running ["
                + Thread.currentThread().getName() + "].");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadAlive(), "I Thread");
        Thread t2 = new Thread(new ThreadAlive(), "II Thread");

        // start t1
        t1.start();

        //
        if (t1.isAlive()) {
            System.out.format("%s is alive.%n", t1.getName());
        } else {
            System.out.format("%s is not alive.%n", t1.getName());
        }

        // czy zostal wystartowany t2 
        if (t2.isAlive()) {
            System.out.format("%s is alive.%n", t2.getName());
        } else {
            System.out.format("%s is not alive.%n", t2.getName());
        }
    }
}
