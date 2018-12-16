package src.main.java;

 



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SideTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SideTest
{
    /**
     * Default constructor for test class SideTest
     */
    public SideTest()
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
    public void testGetNumberInKazan()
    {
        Side test = new Side("light");
        int output = test.getNumberInKazan();
        assertEquals(0, output);
    }
    
    @Test
    public void testGetHole()
    {
        Side test = new Side("light");
        int output = test.getHole(0).getIndex();
        assertEquals(1, output);
    }
    
    @Test
    public void testUpdateKazan()
    {
        Side test = new Side("light");
        test.updateKazan(test.getHole(0));
        int output = test.getNumberInKazan();
        assertEquals(9,output);
    }
    
    @Test
    public void testGetNumberInHole()
    {
        Side test = new Side("light");
        test.updateKazan(test.getHole(0));
        int output = test.getNumberInHole(0);
        assertEquals(0, output);
    }
    
    @Test
    public void testGetColour()
    {
        Side test = new Side("light");
        String output = test.getColour();
        assertEquals("light", output);
    }
    
    @Test
    public void testGetTuz()
    {
        Side test = new Side("light");
        Hole output = test.getTuz();
        assertEquals(null, output);
    }
    
    @Test
    public void testSetTuz()
    {
        Side test = new Side("light");
        test.setTuz(test.getHole(0));
        Hole output = test.getTuz();
        assertEquals(test.getHole(0), output);
    }
    
    @Test
    public void testAddKorgoolsToHole()
    {
        Side test = new Side("light");
        test.addKorgoolsToHole(0);
        int output = test.getNumberInHole(0);
        assertEquals(10, output);
    }

    @Test
    public void testdeleteKorgoolsAtHole()
    {
        Side test = new Side("light");
        test.deleteKorgoolsAtHole(0, 9);
        int output = test.getNumberInHole(0);
        assertEquals(0, output);
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