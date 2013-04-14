/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.File;


public class EmptyDirCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("C:\\a");

        
        if (file.isDirectory()) {
        
            String[] files = file.list();

            if (files.length > 0) {
                System.out.println("The " + file.getPath() + " is not empty!");
            }
        }
    }
}
