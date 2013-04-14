/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import java.util.Date;
import java.lang.reflect.Field;

public class GetFields {

    public Long id;
    protected String name;
    private Date birthDate;
    Double weight;

    public static void main(String[] args) {
        GetFields object = new GetFields();
        Class clazz = object.getClass();

        //
        // fields: public, protected, package and private
        //
        Field[] fields = clazz.getDeclaredFields();
        System.out.println("Number of fields = " + fields.length);
        for (Field field : fields) {
            System.out.println("Field name = " + field.getName());
            System.out.println("Field type = " + field.getType().getName());
        }

        System.out.println("\n----------------------------------------\n");

        //
        // all object >> public fields.
        //
        fields = clazz.getFields();
        System.out.println("Number of fields = " + fields.length);
        for (Field field : fields) {
            System.out.println("Field name = " + field.getName());
            System.out.println("Field type = " + field.getType().getName());
        }

        System.out.println("\n----------------------------------------\n");

        try {
            //
            // field name >> public access modifier
            //
            Field field = clazz.getField("id");
            System.out.println("Field name = " + field.getName());
            System.out.println("Field type = " + field.getType().getName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
