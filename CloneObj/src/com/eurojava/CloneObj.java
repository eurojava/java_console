/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

public class CloneObj implements Cloneable {
    
    private int number;
    private transient int data;

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CloneObj clone = new CloneObj();
        clone.number = 5;
        clone.data = 1000;
        
        try {
            CloneObj objectClone = (CloneObj) clone.clone();
            objectClone.number = 10;
            objectClone.data = 5000;

            System.out.println("cloned object = " + objectClone);
            System.out.println("origin object = " + clone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
            
        
    }
       
    public String toString() {
        return "[number = " + number + "; data = " + data + "]";
    }
}
