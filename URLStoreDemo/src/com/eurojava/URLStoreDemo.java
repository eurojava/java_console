/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class URLStoreDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            URL url = new URL("http://www.nbp.pl/kursy/xml/c070z130410.xml");

            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            BufferedWriter writer = new BufferedWriter(new FileWriter("data.html"));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
