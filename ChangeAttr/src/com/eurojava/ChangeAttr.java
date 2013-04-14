/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.File;

public class ChangeAttr {

    public static void main(String[] args) throws Exception {
        File file = new File("ReadOnly.txt");

        // utworzenie pliku gdy nie istnieje
        file.createNewFile();

        // atrybuty !
        file.setReadOnly();

        // sprawdzenie
        if (file.canWrite())
        {
            System.out.println("File is writable!");
        } else
        {
            System.out.println("File is in read only mode!");
        }
    }
}
