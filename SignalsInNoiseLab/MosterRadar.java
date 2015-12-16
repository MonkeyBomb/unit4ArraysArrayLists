
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class MosterRadar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MosterRadar
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class MosterRadar
     */
    public MosterRadar()
    {
        // initialise instance variables
        x = 0;
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
    public void test()
    {
        Radar radar = new Radar(100,100);
        radar.setMonsterLocation(10,74);

        int[][] Scan = new int [radar.getNumRows()][radar.getNumCols()] ;
        int x = 0;

        while (x < 100)
        { 
            radar.scan();
            x++;
        }

        for (int i = 0; i < Scan.length; i++)
        {
            for (int j = 0; j < Scan[i].length; j++)
            {
                Scan[i][j] = radar.getAccumulatedDetection(i,j);
            }
        }
        int Brightest = Scan[0][0];
        for (int k = 0; k < Scan.length; k++)
        {
            for (int j = 0; j < Scan[k].length; j++)
            {
                if( Scan[k][j] > Brightest)
                {
                    Brightest = Scan[k][j];
                }
            }
        }

        assertEquals(radar.getAccumulatedDetection(10,74), Brightest);
    }
}

