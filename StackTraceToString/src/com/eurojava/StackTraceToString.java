/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.StringWriter;
import java.io.PrintWriter;

public class StackTraceToString {

    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);

            
            e.printStackTrace(pw);

            System.out.println("Error = " + sw.toString());
        }
    }
}
