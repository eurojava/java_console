/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class TempFiles {

    public static void main(String[] args) {
        try {
            
            File user = File.createTempFile("test", ".txt");
            
            user.deleteOnExit();

            //
            // można też tak:
            //
            File data = File.createTempFile("data", ".txt", new File("C:\\temp"));
            data.deleteOnExit();

            // zapis do temp 
            BufferedWriter writer = new BufferedWriter(new FileWriter(data));
            try {
                writer.write("A");
                writer.write("B");
                
            } finally {
                writer.flush();
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
