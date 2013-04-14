/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.Console;
import java.util.Arrays;

public class consinput {

    public static void main(String[] args) {
        // TODO code application logic here
        Console console = System.console();

        if (console != null) {

            String username = console.readLine("Username: ");
            char[] password = console.readPassword("Password: ");

            if (username.equals("admin") && String.valueOf(password).equals("secret")) {
                console.printf("Welcome %1$s.\n", username);

                Arrays.fill(password, ' ');
            } else {
                console.printf("Invalid username or password.\n");
            }

        } else {
            System.out.println("Console is not available.");
        }

    }
}