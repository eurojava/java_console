/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.File;
import java.io.FileNotFoundException;

public class FileExist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        File file = new File("config.xml");

        System.out.println("File = " + file.getAbsolutePath());


        if (!file.exists()) {
            String message = "Cannot find configuration file!";

            System.out.println(message);
            throw new FileNotFoundException(message);
        }


    }
}
