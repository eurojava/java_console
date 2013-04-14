/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.File;

public class CreateDirs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 //

        String directories = "C:\\a\\b\\c\\d\\e\\f\\g\\h\\i";
        File file = new File(directories);

        
        boolean result = file.mkdirs();
        System.out.println("Status = " + result);
    }
}
