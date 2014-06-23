
/**
 * Holds a Time instance (hours, minutes, seconds).
 * 
 * @author Weston Bassler   
 * @version Summer 2014
 */
public class Time
{
    // instance variables
    private int hours;
    private int minutes;
    private int seconds;

    /**
     * Default constructor for objects of class Time.
     * 
     * Default value for all instance variables is 0.
     */
    public Time()
    {
        // initialize all instance fields to default values
        
        hours = 0;
        minutes = 0;
        seconds = 0; 
    }
    
    /**
     * Constructor for objects of class Time.
     * 
     * @param inhrs hrs of time.
     * @param inmins mins of time.
     * @param insecs secs of time.
     */
    public Time(int inhrs, int inmins, int insecs)
    {
        // initialize all instance fields to either the value
        // in an explicit parameter or if none, a default value.... ???? Should this be an if?
        
        if ( inhrs == 0 ) {
            this.hours = 0;
        } else {
            this.hours = inhrs;
        }
        
        if ( inmins == 0 ) {
            this.minutes = 0;
        } else {
            this.minutes = inmins;
        }
        
        if ( insecs == 0 ) {
            this.seconds = 0;
        } else {
            this.seconds = insecs;
        }
    }
     
    /**
     * Constructor for objects of class Time.
     * 
     * The total number of seconds are provided.
     * Compute the hours, minutes, and seconds
     * from the value of total seconds.
     * 
     * @param inTTLsecs total seconds.
     */
    public Time(int inTTLsecs)
    {
        // number of hours
        this.hours = inTTLsecs / 3600; 
        
        // number of minutes
        this.minutes = ( inTTLsecs - ( hours * 3600 )) / 60;
        
        // number of seconds
        this.seconds = ( inTTLsecs - ( hours * 3600 ) - ( minutes * 60 )); 
    }
    
    /**
     * set the hrs.
     * 
     * @param  inhrs hrs of the time.
     *  
     */
    public void setHrs(int inhrs)
    {
        // set the instance field to the value of the 
        // explicit parameter
        
        this.hours = inhrs;
    }
    
    /**
     * get the hrs.
     * 
     * @return int The hour of the time.
     *  
     */
    public int getHrs()
    {
        // return the value of the instance field
        return hours;
    }
    
    /**
     * set the mins.
     * 
     * @param  inmins mins of the time.
     *  
     */
    public void setMins(int inmins)
    {
        // Set the minutes value
        this.minutes = inmins; 
    }
    
    /**
     * get the mins.
     * 
     * @return int The mins of the time.
     *  
     */
    public int getMins()
    {
        // returns minutes
        return minutes;
    }
    
    /**
     * set the secs.
     * 
     * @param  insecs secs of the time.
     *  
     */
    public void setSecs(int insecs)
    {
        // Set the seconds value
        this.seconds = insecs;
    }
    
    /**
     * get the secs.
     * 
     * @return int The secs of the time.
     *  
     */
    public int getSecs()
    {
        // return seconds
        return seconds;
        
        
    }
           
    /**
     * get the number of seconds represented by the Time object.
     * 
     * @return int This Time object as a number of seconds.
     *  
     */
    public int getTotalSecs()
    {        
        // return total seconds.
        
        return seconds + ( hours * 3600 ) + ( minutes * 60 );
    }
    
    /**
     * get the difference between times.
     * 
     * @param  endTime The end time.
     * @return Time The difference between this time and the end time.
     *  
     */
    public Time getDifference(Time endTime)
    {
        // The difference is calculated as endTime - startTime.
        // The value returned should be a new Time object.
        
        // Don't forget to take into account the possibility of
        // the need to carry when subtracting.
        
        // Or possibly using the getTotalSeconds methods of the two
        // Time objects to make it simpler
        // this.hours, this.seconds, this.minutes, endtime
        
        //endTime.getHrs() - this.hours;  
        //endTime.getMins() - this.minutes;  
        //endTime.getHrs() - this.seconds;  
        
        Time tempTime = new Time(endTime.getHrs() - this.hours, endTime.getMins() - this.minutes, endTime.getHrs() - this.seconds);
        
        
        return tempTime ;
    }
    
    /**
     * format a String with the time as HH:MM:SS.
     * 
     * @return String The time in HH:MM:SS format.
     *  
     */
    public String toString()
    {
        // Return the time formatted as HH:MM:SS
        // be sure to include leading zeros to numbers less than 10
        
        // <your code here>
        // "Wrong, wrong, wrong." is not the correct value to return
        /**
        int hrOutput = this.getHrs();
        int minOutput = this.getMins();
        int secOutput = this.getSecs();
        
        
        if ( hrOutput < 10 ) {
            hrOutput = 
        }
        */
       
        return this.getHrs() + ":" + this.getMins() + ":" + this.getSecs();
        
        /**
         * if ( inhrs == 0 ) {
            this.hours = 0;
        } else {
            this.hours = inhrs;
        }
        
        if ( inmins == 0 ) {
            this.minutes = 0;
        } else {
            this.minutes = inmins;
        }
        
        if ( insecs == 0 ) {
            this.seconds = 0;
        } else {
            this.seconds = insecs;
        }
         */
    }
}
