package src.main.java;

 


import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

/**
 * The test class ComputerPlayerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ComputerPlayerTest
{
    /**
     * Default constructor for test class ComputerPlayerTest
     */
    public ComputerPlayerTest()
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
    public void testMove()
    {
        Side dark = new Side("dark");
        Side light = new Side("light");
        Board board = new Board(light, dark);
        ComputerPlayer test = new ComputerPlayer("dark", board);

        boolean move = test.move();
        boolean output;
        if(move) {
            output = true;
        }else{
            output = false;
        }
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
