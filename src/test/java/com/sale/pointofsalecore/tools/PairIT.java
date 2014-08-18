package com.sale.pointofsalecore.tools;

import com.sale.pointofsalecore.tools.Pair;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author Bartosz Cichowicz
 */
public class PairIT {
    
    public PairIT() {
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

    /**
     * Test of of method, of class Pair.
     */
    @org.junit.Test
    public void testOf() {
        System.out.println("of");
        Object left = null;
        Object right = null;
        Pair expResult = null;
        Pair result = Pair.of(left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
