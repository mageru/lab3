import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * The test class TimeTest.
 *
 * @author Tina Comston
 * @version Summer 2014
 */
public class TimeTest 
{
   
    /**
     * Default constructor for test class TimeTest.
     */
    public TimeTest()
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
     * Test the default constructor.
     */
    @Test
    public void testConstructor1()
    {
        // test to ensure the constructor creates the Time object.
        Time timeTest = new Time();
        assertNotNull(timeTest);
        
        //test to ensure each instance variable is initialized.
        assertEquals(0, timeTest.getHrs());
        assertEquals(0, timeTest.getMins());
        assertEquals(0, timeTest.getSecs());
    }
    
    /**
     * Test the first explicit constructor.
     */
    @Test
    public void testConstructor2()
    {
        // test to ensure that this constructor creates the Time object.
        Time timeTest = new Time(2, 5, 10); 
        assertNotNull(timeTest);
        
        assertEquals(2, timeTest.getHrs());
        assertEquals(5, timeTest.getMins());
        assertEquals(10, timeTest.getSecs());
        
        //Test 2. Ensure that if nothing is given set it to 0.
        Time timeTest2 = new Time(0, 0, 0); 
        assertNotNull(timeTest2);
        
        assertEquals(0, timeTest2.getHrs());
        assertEquals(0, timeTest2.getMins());
        assertEquals(0, timeTest2.getSecs());
        
        
    }
   
    /**
     * Test the second explicit constructor.
     */
    @Test
    public void testConstructor3()
    {
        // test to ensure that this constructor creates the Time object correctly.
        Time timeTest = new Time(4000); 
        assertNotNull(timeTest);
        
        assertEquals(1, timeTest.getHrs());
        assertEquals(6, timeTest.getMins());
        assertEquals(40, timeTest.getSecs());
    }
    
    /**
     * Test the setHours method.
     */
    @Test
    public void testSetHrs()
    {
        //Test the setHrs method 1st Constructor.
        Time timeTest = new Time();
        
        timeTest.setHrs(10);
        
        int testSetHours = timeTest.getHrs();
        assertEquals(10, testSetHours);
        
        
    }
    
    /**
     * Test the setMinutes method.
     */
    @Test
    public void testSetMins()
    {
        // Test the setMins method 
        Time timeTest = new Time();
        
        timeTest.setMins(33);
        
        int testSetMins = timeTest.getMins();
        assertEquals(33, testSetMins);
        
    }
    
    /**
     * Test the setSeconds method.
     */
    @Test
    public void testSetSecs()
    {
        // Test the setSecs method.
        
        Time timeTest = new Time();
        
        timeTest.setSecs(2500);
        
        int testSetSecs = timeTest.getSecs();
        assertEquals(2500, testSetSecs);
    }
    
    /**
     * Test the getDiff method.
     */
    @Test
    public void testGetDifference()
    {
        // Be sure to test a situation where carrying is not required
        // and where carrying is required.
        
        Time start = new Time(0, 0, 0);
        
        Time end = new Time(0, 0, 0);
        
        Time timeStart = start.getDifference(end);
        
        assertEquals(0, timeStart.getHrs());
        assertEquals(0, timeStart.getMins());
        assertEquals(0, timeStart.getSecs());
        
        
        //test 2
        Time start2 = new Time(1, 1, 1);
        
        Time end2 = new Time(1, 1, 1);
        
        timeStart = start2.getDifference(end2);
        
        assertEquals(0, timeStart.getHrs());
        assertEquals(0, timeStart.getMins());
        assertEquals(0, timeStart.getSecs());
        
        //test 3  (endTime- startTime)
        Time start3 = new Time(1, 1, 11);
        
        Time end3 = new Time(5, 5, 5);
        
        timeStart = start3.getDifference(end3);
        
        assertEquals(4, timeStart.getHrs());
        assertEquals(3, timeStart.getMins());
        assertEquals(54, timeStart.getSecs());
        
        //test 4  (endTime- startTime)
        Time start4 = new Time(1, 1, 1);
        
        Time end4 = new Time(5, 5, 5);
        
        timeStart = start4.getDifference(end4);
        
        assertEquals(4, timeStart.getHrs());
        assertEquals(4, timeStart.getMins());
        assertEquals(4, timeStart.getSecs());
        
        // Test 5
        Time start5 = new Time(1000);
        
        Time end5 = new Time(4000);
        
        timeStart = start5.getDifference(end5);
        
        assertEquals(4, timeStart.getHrs());
        assertEquals(4, timeStart.getMins());
        assertEquals(4, timeStart.getSecs());
    }
    
    /**
     * Test the getDiffInSeconds method.
     */
    @Test
    public void testGetTotalSecs()
    {
        // Be sure to test a situation where carrying is not required
        // and where carrying is required.
        Time timeTest = new Time(0);
        
        timeTest.getTotalSecs();
        
        int totalSecs = timeTest.getTotalSecs();
        assertEquals(0, totalSecs);
        
        //2nd Test
        Time timeTest2 = new Time(3600);
        
        timeTest2.getTotalSecs();
        
        totalSecs = timeTest2.getTotalSecs();
        assertEquals(3600, totalSecs);
        
        //3rd Test
        Time timeTest3 = new Time(4600);
        
        timeTest3.getTotalSecs();
        
        totalSecs = timeTest3.getTotalSecs();
        assertEquals(4600, totalSecs);
        
    }    
    
    /**
     * Test the toString method.
     */
    @Test
    public void testToString()
    {
        // Be sure to test a string where the hours, minutes, and seconds
        // are greater than 10 and where they are less than 10, to ensure
        // the padding is working correctly.
        
        // <your code here>

        // this statement is not correct - remove or comment out
        assertTrue(false);
    }

}
