import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * The test class MazeResultTest.
 *
 * @author Tina Comston
 * @version Summer 2014
 */
public class MazeResultTest 
{

    /**
     * Default constructor for test class MazeResultTest.
     */
    public MazeResultTest()
    {
        // default constructor
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        // anything needed prior to each test case
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        // anything needed after test cases complete
    }
    
    /**
     * Test the explicit constructor.
     */
    @Test
    public void testConstructor()
    {
        // Test that the constructor created the MazeResult object
        Rat rodentTest = new Rat();
        MazeResult rodentResultTest = new MazeResult(rodentTest);
        assertNotNull(rodentResultTest);
            
        // Test that the rat object was correct initialized    
        assertNull(rodentResultTest.getRat());

        // Test that the startTime object was correct initialized    
        assertNotNull(rodentResultTest.getStartTime());
        assertEquals(0, rodentResultTest.getStartTime().getHrs());
        assertEquals(0, rodentResultTest.getStartTime().getMins());
        assertEquals(0, rodentResultTest.getStartTime().getSecs());
                
        // Test that the endTime object was correct initialized    
        assertNotNull(rodentResultTest.getEndTime());
        assertEquals(0, rodentResultTest.getEndTime().getHrs());
        assertEquals(0, rodentResultTest.getEndTime().getMins());
        assertEquals(0, rodentResultTest.getEndTime().getSecs());
    }
    
    /**
     * Test the setRat method.
     */
    @Test
    public void testSetRat()
    {
        // create a default rat object
        Rat runner1 = new Rat();
        
        // create a MazeResult object with the default rat object
        MazeResult rodentResultTest = new MazeResult(runner1);
        
        // set the rat instance field to a new rat object
        Rat runner2 = new Rat("ee435ae43", 'M', true);
        rodentResultTest.setRat(runner2);
        String acutalChipID;
        
        // retrieve the chipID from the rat object in the MazeResults object
        acutalChipID = rodentResultTest.getRat().getRFID();
        assertEquals("Hint: MazeResult.setRat() does not set new rat", 
            "ee435ae43", acutalChipID);
    }
    
    /**
     * Test the setStartTime and getStartTime methods.
     */
    @Test
    public void testSetStartTime()
    {
        // Create a rat object to be passed to the MazeResult object
        Rat rodentTest = new Rat();
        
        // Create the MazeResult object
        MazeResult rodentResultTest = new MazeResult(rodentTest);
        
        // Set a new start time
        rodentResultTest.setStartTime(8, 33, 28);
        
        // Ensure the start time object is has been created
        assertNotNull(rodentResultTest.getStartTime());
        
        // Ensure each of the attributes of the Time object
        // have been set.
        assertEquals(8, rodentResultTest.getStartTime().getHrs());
        assertEquals(33, rodentResultTest.getStartTime().getMins());
        assertEquals(28, rodentResultTest.getStartTime().getSecs());
    }
    
    /**
     * Test the setEndTime and getEndTime methods.
     */
    @Test
    public void testSetEndTime()
    {
        // <your code here>
        assertTrue(false);
    }
    
    /**
     * Test the setNumberOfErrors and getNumberOfErrors methods.
     */
    @Test
    public void testSetNumberOFErrors()
    {
        // Create a rat object to be passed to the MazeResult object
        Rat rodentTest = new Rat();
        
        // Create the MazeResult object
        MazeResult rodentResultTest = new MazeResult(rodentTest);
        
        // Set the number of errors
        rodentResultTest.setNumOfErrors(5);
 
        // Ensure the attribute has the correct value
        assertEquals(5, rodentResultTest.getNumOfErrors());
    }

    /**
     * Test the getActualTime method.
     */
    @Test
    public void testGetActualTime()
    {
        // <your code here>
        assertTrue(false);
    }
    
    /**
     * Test the getContestTime method.
     */
    @Test
    public void testGetContestTime()
    {
        // <your code here>
        assertTrue(false);
    }
    
    /**
     * Test the toString method.
     */
    @Test
    public void testToString()
    {
        // <your code here>
        assertTrue(false);
    }
}
