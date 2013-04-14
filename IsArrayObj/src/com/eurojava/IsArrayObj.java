/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

public class IsArrayObj {

    public static void main(String[] args) {
        int[][] matrix = {{1, 1}, {2, 1}};
        Class clazz = matrix.getClass();

        //
        // 
        //
        if (clazz.isArray()) {
            System.out.println(clazz.getSimpleName() +
                    " is an array class.");
        } else {
            System.out.println(clazz.getSimpleName() +
                    " is not an array class.");
        }
    }
}
