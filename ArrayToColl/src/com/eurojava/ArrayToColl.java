/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToColl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] array = {"Jeden", "Dwa", "Trzy"};
        List list = Arrays.asList(array);

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println((String) iterator.next());
        }
    }
}
