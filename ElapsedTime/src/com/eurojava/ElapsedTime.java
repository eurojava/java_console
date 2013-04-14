/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;


public class ElapsedTime {


    public static void main(String[] args) {
        // 
        long start = System.nanoTime();
        System.out.println("Start: " + start);

        
        //
        int totalEven = 0;
        for (int i = 0; i < 10000; i++) {
            if (i % 2 == 0) {
                totalEven = totalEven + i;
            }
        }

        // 
        long end = System.nanoTime();
        System.out.println("End  : " + end);

        long elapsedTime = end - start;

        // 
        System.out.println("The process took approximately: "
                + elapsedTime + " nano seconds");
    }
}
