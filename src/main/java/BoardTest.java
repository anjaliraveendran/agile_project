package src.main.java;

 



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

/**
 * The test class BoardTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class BoardTest
{
    /**
     * Default constructor for test class BoardTest
     */
    public BoardTest()
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
    public void testDarkWin()
    {
        Board test = new Board("light", "dark");
        boolean output = test.darkWin();
        assertEquals(false, output);
    }
    
    @Test
    public void testLightWin()
    {
        Board test = new Board("light", "dark");
        boolean output = test.lightWin();
        assertEquals(false, output);
    }
    
    @Test
    public void testMoveBalls()
    {
        Side dark = new Side("dark");
        Side light = new Side("light");
        Board test = new Board(light, dark);
        test.moveBalls(0, "light");
        int[] shouldbe = new int[] {1,10,10,10,10,10,10,10,10};
        int[] outputArray = new int[9];
        for(int i = 0; i < 9; i++)
        {
            outputArray[i] = light.getNumberInHole(i);
        }
        boolean output = Arrays.equals(shouldbe, outputArray);
        assertEquals(true, output);
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
