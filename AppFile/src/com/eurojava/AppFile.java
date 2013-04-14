/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class AppFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File file = new File("test.txt");

        try 
        {            
            FileWriter writer = new FileWriter(file, true);
            writer.write("append text" 
                    + System.getProperty("line.separator"));
            writer.flush();
            writer.close();
        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
