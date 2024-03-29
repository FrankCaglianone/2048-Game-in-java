package model;


import static org.junit.Assert.*;
import org.junit.Test;

/**
 * The test class SpawnTest.
 *
 * @author  (Raffaele Perri, Francesco Caglianone)
 * @version (a version number or a date)
 */
public class SpawnTest
{
    /**
     * Default constructor for test class SpawnTest
     */
    public SpawnTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Test
    public void testSpawn1()
    {
        Grid g1 = new Grid();
        Grid g2 = new Grid();
        Spawn sp1 = new Spawn(g1);
        Spawn sp2 = new Spawn(g2);
        
        assertFalse(sp1.equals(sp2));            
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Test
    public void testSpawn2()
    {
        Grid g1 = new Grid();
        Grid g2 = new Grid();
        Spawn sp1 = new Spawn(g1);
        
        assertFalse(sp1.equals(g2));            
    }
}
