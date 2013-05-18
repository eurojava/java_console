/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

/**
 *
 * @author Darek
 */
public class TddSquare {
    
    private double a = 0;

    
    public TddSquare(double a) {
        this.a = a;
    }
    
    public double getA() {
        return a;
    }
    
    public double Squere() {
        return a*a;
}

    public TddSquare() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.a) ^ (Double.doubleToLongBits(this.a) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TddSquare other = (TddSquare) obj;
        if (Double.doubleToLongBits(this.a) != Double.doubleToLongBits(other.a)) {
            return false;
        }
        return true;
    }

    public void setA(double a) {
        this.a = a;
    }

    
}
