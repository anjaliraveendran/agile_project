 

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class KazanTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KazanTest
{
    /**
     * Default constructor for test class KazanTest
     */
    public KazanTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }
    
    @Test
    public void testGetNumberOfKorgools()
    {
        Kazan test = new Kazan();
        int output = test.getNumberOfKorgools();
        assertEquals(0, output);
    }
        
    @Test
    public void testAddKorgools()
    {
        Kazan test = new Kazan();
        for(int i = 0; i < 15; i++) {
            test.addKorgools(3);
        }
        int output = test.getNumberOfKorgools();
        assertEquals(45, output);
    }
      

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}