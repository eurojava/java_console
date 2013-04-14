/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.FileInputStream;
import java.util.Properties;

public class propxmlload {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        propxmlload lxp = new propxmlload();

        try {
            Properties properties = lxp.readProperties();
            properties.list(System.out);

            String dataFolder = properties.getProperty("data.folder");
            System.out.println("dataFolder = " + dataFolder);
            String jdbcUrl = properties.getProperty("jdbc.url");
            System.out.println("jdbcUrl = " + jdbcUrl);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public Properties readProperties() throws Exception {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("system.xml");
        properties.loadFromXML(fis);

        return properties;


    }
}
