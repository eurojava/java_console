/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;

public class CountLines {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        File file = null;
        FileReader fr = null;
        LineNumberReader lnr = null;

        try {
            
            file = new File("input.csv");

            
            fr = new FileReader(file);
            lnr = new LineNumberReader(fr);

           
            String line = "";
            while ((line = lnr.readLine()) != null) {
           
                System.out.println("Line Number " + lnr.getLineNumber()
                        + ": " + line);
            }
        } finally {
           
            if (fr != null) {
                fr.close();
            }
            if (lnr != null) {
                lnr.close();
            }
        }
    }
}
