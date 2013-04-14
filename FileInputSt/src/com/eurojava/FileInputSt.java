/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputSt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//
        
        String tempDir = System.getProperty("java.io.tmpdir");
        File file = new File(tempDir + "\\data.txt");

        StringBuilder builder = new StringBuilder();
        FileInputStream fis = null;
        try {
            
            fis = new FileInputStream(file);

            int data;
        
            // -1 - nie ma wiecej danych do odczytu
            while ((data = fis.read()) != -1) {
                builder.append((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        
        System.out.println("File Contents = " + builder.toString());
    }
}
