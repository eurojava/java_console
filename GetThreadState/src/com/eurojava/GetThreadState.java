/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

public class GetThreadState implements Runnable {

    public void run() {
        System.out.println("Start..");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread thread = new Thread(new GetThreadState());
        thread.start();

        // stan
        Thread.State state = thread.getState();
        System.out.println("State: " + state.name());
    }
}
