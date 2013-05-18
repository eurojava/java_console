/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

/**
 *
 * @author Darek
 */

import com.eurojava.MyAnnotationClass;

public class Annot {

    public static void main(String[] args) {

        // create class
        MyClass myClass = new MyClass();
        Class clazz = myClass.getClass();

        // get annot from class
        for (int i = 0; i < clazz.getAnnotations().length; i++) {
            // print annot
            System.out.println("Nazwa adnotacji: " + clazz.getAnnotations()[i]);
            System.out.println("Wartość atrybutu id: "
                    + ((MyAnnotationClass) clazz.getAnnotations()[i]).id());
            System.out.println("Wartość atrybutu name: "
                    + ((MyAnnotationClass) clazz.getAnnotations()[i]).name());
        }

        // get all public/packet methods from MyClass
        for (int i = 0; i < clazz.getMethods().length; i++) {
            
            // get all annot - method
            for (int j = 0; j < clazz.getMethods()[i].getAnnotations().length; j++) {
               
                System.out.println("\nNazwa metody z adnotacją: "
                        + clazz.getMethods()[i].getName());
                
                System.out.println("Nazwa adnotacji: "
                        + clazz.getMethods()[i].getAnnotations()[j]);
            }
        }
    }
}
