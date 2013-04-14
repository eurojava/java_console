/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadFileToArr {


    public static void main(String[] args) throws Exception {
        InputStream is = null;
        try {
            File file = new File("C:\\test.txt");
            is = new FileInputStream(file);
            
            // !!!
            if (file.length() > Integer.MAX_VALUE) {
                throw new IOException("File is too large.");
            }

            int offset = 0;
            int bytesRead;
            
            byte[] bytes = new byte[(int) file.length()];
            while (offset < bytes.length
                    && (bytesRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
                offset += bytesRead;
            }
        } finally {
            if (is != null) {
                is.close();
            }
        }
    }
}
