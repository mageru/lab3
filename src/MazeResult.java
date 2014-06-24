
/**
 * Provides maze results for a rodent.
 * 
 * @author Weston Bassler
 * @version Summer 2014
 */
public class MazeResult
{
    // instance variables
    private Rat rodent;
    private Time startTime;
    private Time endTime;
    private int numberOfErrors;

    /**
     * Constructor for objects of class MazeResult.
     * 
     * default values are:
     *  start & end time = default Time object
     *  number of errors = 0
     * 
     * @param inRat Rat object.
     */
    public MazeResult(Rat inRat)
    {
        // set the instance field(s) equal to the explicit
        // parameters and initialize all others as follows:
        //    startTime - Time object created using default 
        //                constructor
        //    endTime   - Time object created using default 
        //                constructor
        //    numberOfErrors - zero
        
        // <your code here>
        rodent = inRat;
        numberOfErrors = 0;
        Time startTime = new Time();
        Time endTime = new Time();
    }

    /**
     * Sets the rodent.
     * 
     * @param inRat Rat object.
     */
    public void setRat(Rat inRat)
    {
        // <your code here>
        this.rodent = inRat;
    }
    
    /**
     * Gets the rodent.
     * 
     * @return Rat The Rat object.
     */
    public Rat getRat()
    {
        // <your code here>
        
        // null is not the correct value to return
        return rodent;
    }
    
    /**
     * Sets the start time for the rodent.
     * 
     * @param inHrs Hours of the rodent's start time.
     * @param inMins Minutes of the rodent's start time.
     * @param inSecs Seconds of the rodent's start time.
     */
    public void setStartTime(int inHrs, int inMins, int inSecs)
    {
        // Create a new time object with the explicit parameters 
        this.startTime = new Time(inHrs, inMins, inSecs);
    }
    
    /**
     * Gets the start time for the rodent.
     * 
     * @return Time The start time of the rodent.
     */
    public Time getStartTime()
    {
        Time tempStartTime = new Time(this.startTime.getHrs(),
            this.startTime.getMins(), this.startTime.getSecs());
        return tempStartTime;
    }
    
    /**
     * Sets the end time for the rodent.
     * 
     * @param inHrs Hours of the rodent's end time.
     * @param inMins Minutes of the rodent's end time.
     * @param inSecs Seconds of the rodent's end time.
     */
    public void setEndTime(int inHrs, int inMins, int inSecs)
    {
        // Create a new time object with the explicit parameters 
        
        this.endTime = new Time(inHrs, inMins, inSecs);
    }
    
    /**
     * Gets the end time for the rodent.
     * 
     * @return Time The end time of the rodent.
     */
    public Time getEndTime()
    {
        // Refer to the getStartTime method for example
        // <your code here>

        // Return a new Time object, not a pointer to the existing Time
        // object 
        Time tempEndTime = new Time(this.endTime.getHrs(),
            this.endTime.getMins(), this.endTime.getSecs());
        return tempEndTime;
    }
    
    /**
     * Sets the number of errors for the rodent.
     * 
     * @param inNumOfErrors of the rodent's result.
     */
    public void setNumOfErrors(int inNumOfErrors)
    {
        // <your code here>
        this.numberOfErrors = inNumOfErrors;
    }
    
    /**
     * Gets the number of errors for the rodent.
     * 
     * @return int The number of errors for the rodent.
     */
    public int getNumOfErrors()
    {
        return numberOfErrors;
    }
    
    /**
     * Gets the actual maze time for the rodent.
     * 
     * @return String The formatted actual time for the rodent.
     */
    public String getActualTime()
    {
        // Take advantage of both the getDiff() and toSring() methods
        // of the Time class to compute the actual maze time and 
        // format it as HH:MM:SS
        
        // <your code here>
        // "Wrong, wrong, wrong" is not the correct value to return

        return (this.getStartTime().getDifference(this.getEndTime())).toString();
    }   
    
    /**
     * Gets the contest (adjusted) maze time for the rodent.
     * 
     * @return String The formatted contest time for the rodent.
     */
    public String getContestTime()
    {
        int timePenalty = 0;

        for(int i=1;i<this.getNumOfErrors();i++) {
            if(i < 3 ) {
                timePenalty = timePenalty + 3;
            } else if (i < 5) {
                timePenalty = timePenalty + 5;
            } else {
                timePenalty = timePenalty + 7;
            }
        }

        Time actualTime = this.getStartTime().getDifference(this.getEndTime());
        int actualSeconds = actualTime.getTotalSecs();
        int finalTimeSeconds = actualSeconds + timePenalty;

        if(this.getRat().getGender() == 'F') {
            finalTimeSeconds = (int)Math.round(finalTimeSeconds * .9);
        }

        if(!this.getRat().getIsVaccinated()) {
            finalTimeSeconds = (int)Math.round(finalTimeSeconds * 1.1);
        }

        Time finalTime = new Time(finalTimeSeconds);

        return finalTime.toString();
    }   
    
    /**
     * Gets a formatted string with information for the rodent and maze.
     * 
     * @return String String with information for rodent and maze.
     */
    public String toString()
    {
        // Format of output should be:
        
        // Rodent's Information:  rat toString information goes here
        // Maze Information:
        // Start Time: HH:MM:SS
        // End Time: HH:MM:SS
        // Actual Time: HH:MM:SS
        // Contest Time: HH:MM:SS
        
        // <your code here>
        // "Wrong, wrong, wrong" is not the correct value to return
        String output = "Start Time: " + this.getStartTime().toString() + "\n"
                       +"End Time: " + this.getEndTime().toString() + "\n"
                       +"Actual Time: " + this.getActualTime() + "\n"
                       +"Contest Time: " + this.getContestTime() + "\n";
        return output;
    }   
}
