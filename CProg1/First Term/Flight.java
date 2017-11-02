//Constanza Cabrera
//11.24.15

public class Flight
{
      /** @return time at which the flight departs
      */
      private Time departTime;
      private Time arriveTime;
      public Flight(Time Depart, Time Arrive)
      {
          departTime = Depart;
          arriveTime = Arrive;
      }
      
      public Time getDepartureTime()
      {
          return departTime;
      }

      /** @return time at which the flight arrives
      */
      public Time getArrivalTime()
      {
          return arriveTime;
      }
      // There may be instance variables, constructors, and methods not shown.
}
