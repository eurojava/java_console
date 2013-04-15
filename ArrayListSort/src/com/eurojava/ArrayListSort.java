/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ArrayListSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List greek = new ArrayList();
        greek.add("alfa");
        greek.add("beta");
        greek.add("gamma");
        greek.add("delta");
        greek.add("psi");
        greek.add("epsilon");
        greek.add("omega");

        Collections.sort(greek);
        System.out.println(Arrays.toString(greek.toArray()));

        Collections.sort(greek, Collections.reverseOrder());
        System.out.println(Arrays.toString(greek.toArray()));
    }
}
