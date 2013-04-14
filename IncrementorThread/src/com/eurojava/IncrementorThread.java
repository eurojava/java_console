/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

class Incrementor {
    private int count;

    
    // synchronized
    
    public synchronized void increment(int value) {
        count += value;
        System.out.println(Thread.currentThread().getName() +
                ": inc >>> " + count);
    }

    public void decrement(int value) {
        
        // synchronized block 
        // monitor object.
        //
        synchronized (this) {
            count -= value;
            System.out.println(Thread.currentThread().getName() +
                    ": dec >>> " + count);
        }
    }
}

class IncrementThread implements Runnable {
    private Incrementor incrementor;

    public IncrementThread(Incrementor incrementor) {
        this.incrementor = incrementor;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            incrementor.increment(i * 10);
            incrementor.decrement(i * 2);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class IncrementorThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Incrementor incrementor = new Incrementor();

        Thread t1 = new Thread(new IncrementThread(incrementor), "T1");
        Thread t2 = new Thread(new IncrementThread(incrementor), "T2");

        t1.start();
        t2.start();
    }
}
