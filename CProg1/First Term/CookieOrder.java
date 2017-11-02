//Constanza Cabrera
//11.18.15


import java.util.Scanner;
public class CookieOrder
{
    private int numBoxes;
    private String variety; 

    /** Constructs a new CookieOrder object. */
    public CookieOrder(String variety, int numBoxes)
    {
        this.variety=variety;
        this.numBoxes=numBoxes;
    }

    /** @return the variety of cookie being ordered
     */
    public String getVariety()
    { /* implementation not shown */ 
        return variety;
    }

    /** @return the number of boxes being ordered
     */
    public int getNumBoxes()
    { /* implementation not shown */ 
        return numBoxes;
    }

    public String toString()
    {
        return(numBoxes + " Boxes of " + variety);
    }
    // There may be instance variables, constructors, and methods that are not shown.
}