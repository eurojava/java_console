/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

/**
 *
 * @author Darek
 */
public class TddVectors {
    
    private double x;
    private double y;
    private double z;

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }
    
    public TddVectors multiply(double num) {
        return new TddVectors(this.x * num, this.y * num, this.z * num);
    }
    
    public TddVectors divide(double num) {
        return new TddVectors(this.x / num, this.y / num, this.z / num);
    }

    public TddVectors(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
}
