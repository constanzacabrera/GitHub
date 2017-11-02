import java.util.Scanner;
public class TimeCalculate
{
   public static void TimeCalculate()
    {
        Scanner scnr = new Scanner(System.in);
        int seconds;
        
        System.out.print("Enter a number of seconds: ");
        seconds = scnr.nextInt();
        
        int minutes;
        int hours;
        int days;
        int seconds1;
        days = seconds / 60 /60 /24;
        hours = (int) ( seconds / 60 / 60) % 24;
        minutes = (int) (seconds /60)% 60;
        seconds1 = (int) seconds % 60;
        if (seconds > 0){
        System.out.println("Enter the amount in second " + seconds);
        System.out.println(days + " days");
        System.out.println(hours + " hours");
        System.out.println(minutes + " minutes");
        System.out.println(seconds1 + " seconds");
    }
        else
            System.out.println("Please enter a number: ");
    
    
    }
}
