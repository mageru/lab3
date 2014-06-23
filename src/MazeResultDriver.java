
/**
 * Driver to demonstrate MazeResult class.
 * 
 * @author Tina Comston 
 * @version Summer 2014
 */
public class MazeResultDriver
{
    
    /**
     * Create Rat object, then MazeResultDriver.
     * 
     */
    public static void main()
    {
        // set up data for runner, runnerResult
        Rat myRat = new Rat("fe453fa38", 'F', true);
        MazeResult myResult = new MazeResult(myRat);
        myResult.setStartTime(12, 15, 0);
        myResult.setEndTime(15, 49, 16);
        myResult.setNumOfErrors(2);
        System.out.println(myResult.toString());  
    }
    

}
