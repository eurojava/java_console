/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.File;

public class DelFile {

    public static void main(String[] args) {
         // 
        File file = new File("readme.txt");
 
        // 
        if (file.exists())
        {
            System.out.println("Deleting file " + file.getAbsolutePath());
            // 
            file.delete();
        } else
        {
            System.out.println(file.getAbsolutePath() + " doesn't exists.");
        }
    }
}
