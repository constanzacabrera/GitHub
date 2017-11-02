public class AppointmentDriver
{
    public static void main()
    {
        Appointment a1 = new Appointment( 2, 5);
        Appointment a2 = new Appointment( 6, 8);
        Appointment a3 = new Appointment( 10, 12);

        Appointment b1 = new Appointment( 7, 9);
        Appointment b2 = new Appointment( 3, 4 );

        DailySchedule today = new DailySchedule();

        System.out.println("Appointment a1 added: " + today.addAppt( a1, false ) );//Should print true.
        System.out.println("Appointment a2 added: " + today.addAppt( a2, false ) );//Should print true.
        System.out.println("Appointment a3 added: " + today.addAppt( a3, false ) );//Should print true.
        System.out.println();

        //New Normal Appointment
        System.out.println("Appointment b1 added: " + today.addAppt( b1, false ) );//Should print false.

        //New Emergency Appointment
        System.out.println("Appointment b2 added: " + today.addAppt( b2, true ) );//Should print true.
    }
} 