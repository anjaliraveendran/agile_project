 



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;

/**
 * The test class HumanPlayerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class HumanPlayerTest
{
    /**
     * Default constructor for test class HumanPlayerTest
     */
    public HumanPlayerTest()
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
        HumanPlayer test = new HumanPlayer("light", board);
        test.move(0);
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
