import java.util.ArrayList;
/**
 * Write a description of class DailySchedule here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DailySchedule
{
    private ArrayList<Appointment> apptList;

    public DailySchedule()
    {
        apptList = new ArrayList<Appointment>();
    }

    public void clearConflicts(Appointment appt)
    {
    }
    
    public boolean addAppt(Appointment appt, boolean emergency)
    {
        return false;
    }
}
