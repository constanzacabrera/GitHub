//Constanza Cabrera
//11.12.15

public class Trail
{
    /** Representation of the trail. The number of markers on the trail is markers.length. */
    private int[] markers;

    public Trail(int [] segments)
    {
        markers = segments;
    }

    /** Determines if a trail segment is level. A trail segment is defined by a starting marker,
     * an ending marker, and all markers between those two markers.
     * A trail segment is level if it has a difference between the maximum elevation
     * and minimum elevation that is less than or equal to 10 meters.
     * @param start the index of the starting marker
     * @param end the index of the ending marker
     * Precondition: 0 <= start < end <= markers.length - 1
     * @return true if the difference between the maximum and minimum
     * elevation on this segment of the trail is less than or equal to 10 meters;
     * false otherwise.
     */
    public boolean isLevelTrailSegment(int start, int end)
    {   /* to be implemented in part (a) */ 
        int max = markers[start];
        int min = markers[start];

        for (int i=(start+1); i<=end; i++) 
        {
            if (markers[i] > max)
                max = markers[i];
            if (markers[i] < min)
                min = markers[i];
        }

        if (max-min<=10)
            return true;
        else 
            return false; 
        // replace with your code
    }

    /** Determines if this trail is rated difficult. A trail is rated by counting the number of changes in
     * elevation that are at least 30 meters (up or down) between two consecutive markers. A trail
     * with 3 or more such changes is rated difficult.
     * @return true if the trail is rated difficult; false otherwise.
     */
    public boolean isDifficult()
    {   /* to be implemented in part (b) */ 
        int numOver30 = 0;
        for (int i=0; i<markers.length-1; i++) 
        {
            if (Math.abs(markers[i+1]-markers[i]) >= 30)
                numOver30++;
        }
        return (numOver30>=3); 
        // replace with your code
    }
    // There may be instance variables, constructors, and methods that are not shown.
}