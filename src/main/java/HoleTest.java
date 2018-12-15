 

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class HoleTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HoleTest
{
    /**
     * Default constructor for test class HoleTest
     */
    public HoleTest()
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
    public void testInitial()
    {
        Hole test = new Hole(0);
        int output = test.getNumberOfKorgools();
        assertEquals(9, output);
    }
    
    
    @Test
    public void testAddKorgools()
    {
        Hole test = new Hole(0);
        for(int i = 0; i < 15; i++) {
            test.addKorgools();
        }
        int output = test.getNumberOfKorgools();
        assertEquals(24, output);
    }
    
     @Test
    public void testColour()
    {
        Hole test = new Hole(0);
        test.setColour("Black");
        String output = test.getColour();
        assertEquals("Black", output);
    }
    
    @Test
    public void testDeleteKorgools()
    {
        Hole test = new Hole(0);
        for(int i = 0; i < 3; i++) {
            test.deleteKorgools(2);
        }
        int output = test.getNumberOfKorgools();
        assertEquals(3, output);
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