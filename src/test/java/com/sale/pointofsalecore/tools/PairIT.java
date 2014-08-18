package com.sale.pointofsalecore.tools;

import static com.sale.pointofsalecore.tools.Pair.of;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author parun
 */
public class PairIT {
    private static final Logger LOG = getLogger(PairIT.class.getName());
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    public PairIT() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of of method, of class Pair.
     */
    @org.junit.Test
    public void testOf() {
        Object left = null;
        Object right = null;
        Pair expResult = null;
        Pair result = of(left, right);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
