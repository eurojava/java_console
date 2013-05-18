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
import com.eurojava.MyAnnotationMethod;

@MyAnnotationClass(id = 1, name = "SomeAnnoText")
public class MyClass {

    @MyAnnotationMethod
    public void test() {
    }
}
