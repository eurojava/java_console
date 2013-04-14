/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SystemEnv {

    public static void main(String[] args) {
         
        Map map = System.getenv();
 
     
        Set keys = map.keySet();
        Iterator iterator = keys.iterator();
        while (iterator.hasNext())
        {
     
            String key = (String) iterator.next();
            String value = (String) map.get(key);
 
            System.out.println(key + " = " + value);
        }
    }
}
