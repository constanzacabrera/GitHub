
/**
 * Write a description of class Appointment here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Appointment
{
    TimeInterval ti;
    
    public Appointment(int start, int end)
    {
       // Your code here. 
    }
    public TimeInterval getTime()
    {
        TimeInterval tI = new TimeInterval();
        return tI;
    }
    
    public boolean conflictsWith(Appointment other)
    {
        return true;
    }

}
