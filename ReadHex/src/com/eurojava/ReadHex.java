/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.FileInputStream;

public class ReadHex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        FileInputStream fis = null;
        try {
            // 
            fis = new FileInputStream("C:\\data.txt");

            //
            int i = 0;

            // numerowanie co 16
            int count = 0;

            //
            while ((i = fis.read()) != -1) {
                if (i != -1) {
                    System.out.printf("%02X ", i);
                    count++;
                }

                if (count == 16) {
                    System.out.println("");
                    count = 0;
                }
            }
        } finally {
            
            fis.close();
        }
    }
}
