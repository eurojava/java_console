/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProcessResult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            //Process process = Runtime.getRuntime().exec("dir");
            Process process = Runtime.getRuntime().exec("ls -al");

            //
            // oczekiwanie na zakończenie procesu
            //
            process.waitFor();

            //
            // pobranie wyniku
            //
            int exitValue = process.exitValue();
            System.out.println("exitValue = " + exitValue);

            
            // 
            // wczytanie zawartości 
            //
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
