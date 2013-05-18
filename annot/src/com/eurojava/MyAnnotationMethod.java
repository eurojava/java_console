/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

/**
 *
 * @author Darek
 */
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotationMethod {
}
