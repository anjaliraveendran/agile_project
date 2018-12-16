package src.main.java;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BoardTest.
 * tests class Board
 *
 *Team Echidna
 * Agile Group Project
 * @authors (Anjali Raveendran)
 */
public class BoardTest
{
    private Board board1;
    
    /**
     * Default constructor for test class BoardTest
     * used to test BoardTest Class
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
        board1 = new Board();
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
    

    @Test
    public void testMoveBalls(int index)
    {
        assertEquals(0, board1.getNumberInHole(index));
    }

}