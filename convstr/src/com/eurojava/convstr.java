/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Darek
 */
public class convstr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            Date today = df.parse("20/12/2012");
            System.out.println("Today = " + df.format(today));           
        } catch (ParseException e) {
            e.printStackTrace();
        }
                
    }
}
