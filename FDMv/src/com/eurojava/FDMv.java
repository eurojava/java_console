/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.File;
import java.io.IOException;

public class FDMv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        File oldFile = new File("OldFile.txt");
        oldFile.createNewFile();

        File newFile = new File("NewFile.txt");

        
        oldFile.renameTo(newFile);
    }
}
