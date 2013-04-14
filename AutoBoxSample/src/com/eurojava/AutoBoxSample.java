/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.util.HashMap;
import java.util.Map;

public class AutoBoxSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();


        map.put("Age", 25);


        int age = map.get("Age");


        Integer newAge = age + 10;
    }
}
