package model;



import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

/**
 * The test class GridTest.
 *
 * @author  (Raffaele Perri, Francesco Caglianone)
 * @version (a version number or a date)
 */
public class GridTest
{
    /**
     * Default constructor for test class GridTest
     */
    public GridTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Test
    public void testGrid()
    {
        int g1[][] = { {0, 0, 0, 0},
                       {0, 0, 0, 0},
                       {0, 0, 0, 0},
                       {0, 0, 0, 0}
                    };
        Grid g2 = new Grid();
        
                    
        assertTrue(Arrays.deepEquals(g1,g2.getGrid())); 
    }
    
    
    
}
