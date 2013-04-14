/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.File;

public class AppTerminate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("config.xml");

        int errCode = 0;
        if (!file.exists()) {
            errCode = 1;
        } else {
            errCode = 0;
        }

        // terminate
        if (errCode > 0) {
            System.exit(errCode);
        }
    }
}
