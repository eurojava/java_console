/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

public class CurrDirectory {

    public static void main(String[] args) {

        String USER_DIR_KEY = "user.dir";
        String currentDir = System.getProperty(USER_DIR_KEY);

        System.out.println("Working Directory: " + currentDir);
    }
}
