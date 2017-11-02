
/**
 * Write a description of class TimeInterval here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TimeInterval
{
    private int start;
    private int end;

    public TimeInterval( int from, int to )
    {
        start = from;
        end = to;
    }
    
    public TimeInterval()
    {
        start = 0;
        end = 0;
    }

    public int getStart()
    {
        return start;
    }

    public int getEnd()
    {
        return end;
    }

    public boolean overlapsWith( TimeInterval interval )
    {
        if( interval.getStart() < start && (interval.getEnd() >= start && interval.getEnd()<= end) )
        {
            return true;
        } 
        else if( (interval.getStart() >= start && interval.getStart() <= end) && interval.getEnd() > end ) 
        {
            return true;
        }
        else if( interval.getStart() > start && interval.getEnd() < end  )
        {
            return true;
        }
        else if( interval.getStart() < start && interval.getEnd() > end  )
        {
            return true; 
        }
        else if( interval.getStart() == start && interval.getEnd() == end  )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}