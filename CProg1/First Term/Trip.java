//Constanza Cabrera
//11.24.15

import java.util.ArrayList;
public class Trip
{
      private ArrayList<Flight> flights;
      // stores the flights (if any) in chronological order

      /** @return the number of minutes from the departure of the first flight to the arrival
      * of the last flight if there are one or more flights in the trip;
      * 0, if there are no flights in the trip
      */
      public int getDuration()
      { /* to be implemented in part (a) */ 
        if (flights.size()==0)
        {
            return 0;
        }
        else
        {
            Time start = flights.get(0).getDepartureTime();
            Time end = flights.get(flights.size()-1).getArrivalTime();
            return start.minutesUntil(end);
        }
        }

      /** Precondition: the departure time for each flight is later than the arrival time of its
      * preceding flight
      * @return the smallest number of minutes between the arrival of a flight and the departure
      * of the flight immediately after it, if there are two or more flights in the trip;
      * -1, if there are fewer than two flights in the trip
      */
      public int getShortestLayover()
      { /* to be implemented in part (b) */
          if(flights.size()<2)
          {
              return -1;
          }
          else 
          {
              int shortest = getDuration();
              for (int i = 0; i < flights.size()-1; i++)
              {
                  Time arrive = flights.get(i).getArrivalTime();
                  Time leave = flights.get(i+1).getDepartureTime();
                  int layover = arrive.minutesUntil(leave);
                  if(layover<shortest)
                  {
                      shortest = layover;
                    }
                }
              return shortest;
            }
      }
      // There may be instance variables, constructors, and methods that are not shown.
}
