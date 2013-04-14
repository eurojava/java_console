/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.net.InetAddress;


public class JavaPing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            InetAddress address = InetAddress.getByName("10.0.0.1");

            // timeout?
            boolean reachable = address.isReachable(10000);

            System.out.println("Is host reachable? " + reachable);
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
