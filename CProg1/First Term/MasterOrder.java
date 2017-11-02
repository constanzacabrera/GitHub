//11.18.15
//Constanza Cabrera

import java.util.ArrayList;
public class MasterOrder
{
    /** The list of all cookie orders */
    private ArrayList<CookieOrder> orders;

    /** Constructs a new MasterOrder object. */
    public MasterOrder()
    {
        orders = new ArrayList<CookieOrder>(); 
    }
    
    /** Adds theOrder to the master order.
     * @param theOrder   the cookie order to add to the master order
     */
    public void addOrder(CookieOrder theOrder)
    {
        orders.add(theOrder); 
    }

    /** @return the sum of the number of boxes of all of the cookie orders
     */
    public int getTotalBoxes()
    {// to be implemented in part (a) 
        int total = 0;
        for(int x = 0; x < orders.size(); x++)
        {
            total += orders.get(x).getNumBoxes();
        }
        return total;

    }

    /** Removes all cookie orders from the master order that have the same variety of
     * cookie as cookieVar and returns the total number of boxes that were removed.
     * @param cookieVar the variety of cookies to remove from the master order
     * @return the total number of boxes of cookieVar in the cookie orders removed
     */

    public int removeVariety(String cookieVar)
    { /* to be implemented in part (b) */ 
        {
            int counter = 0;
            for(int x = 0; x<orders.size();x++)
            {
                if(orders.get(x).getVariety().equalsIgnoreCase(cookieVar))
                {
                    orders.remove(x);
                    counter++;
                    x--;
                }
            }
            return counter;
        }
    }
    // There may be instance variables, constructors, and methods that are not shown.
    public void showOrders()
    { /* to be implemented */
        for(int x = 0; x<orders.size(); x++)
        {
            System.out.println(orders.get(x));
        }
    }
}