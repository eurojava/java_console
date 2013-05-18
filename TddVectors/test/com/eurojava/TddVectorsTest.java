/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eurojava;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Darek
 */
public class TddVectorsTest {
    
    public TddVectorsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetX() {
        System.out.println("getX");
        TddVectors instance = null;
        double expResult = 0.0;
        double result = instance.getX();
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    @Test
    public void testGetY() {
        System.out.println("getY");
        TddVectors instance = null;
        double expResult = 0.0;
        double result = instance.getY();
        assertEquals(expResult, result, 0.0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetZ() {
        System.out.println("getZ");
        TddVectors instance = null;
        double expResult = 0.0;
        double result = instance.getZ();
        assertEquals(expResult, result, 0.0);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMultiply() {
        System.out.println("multiply");
        double num = 0.0;
        TddVectors instance = null;
        TddVectors expResult = null;
        TddVectors result = instance.multiply(num);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testDivide() {
        System.out.println("divide");
        double num = 0.0;
        TddVectors instance = null;
        TddVectors expResult = null;
        TddVectors result = instance.divide(num);
        assertEquals(expResult, result);
        //fail("The test case is a prototype.");
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TddVectors.main(args);
        //fail("The test case is a prototype.");
    }
}