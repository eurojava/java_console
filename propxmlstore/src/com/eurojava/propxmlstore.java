/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propxmlstore {

    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        Properties properties = new Properties();
        properties.setProperty("database.type", "mysql");
        properties.setProperty("database.url", "jdbc:mysql://localhost/mydb");
        properties.setProperty("database.username", "root");
        properties.setProperty("database.password", "root");
        
        FileOutputStream fos = new FileOutputStream("system.xml");
        properties.storeToXML(fos, "System Configuration", "UTF-8");
    }
}
