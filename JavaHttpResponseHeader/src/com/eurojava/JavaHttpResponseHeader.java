/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Darek
 */
public class JavaHttpResponseHeader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.inspektor-radiolog.pl/index.html");
            URLConnection connection = url.openConnection();

            Map responseMap = connection.getHeaderFields();
            for (Iterator iterator = responseMap.keySet().iterator(); iterator.hasNext();) {
                String key = (String) iterator.next();
                System.out.print(key + " = ");

                List values = (List) responseMap.get(key);
                for (int i = 0; i < values.size(); i++) {
                    Object o = values.get(i);
                    System.out.print(o + ", ");
                }
                System.out.println("");
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
