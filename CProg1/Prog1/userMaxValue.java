import java.util.Scanner;

public class userMaxValue
{
    public static void main(String[] args)
    {
     Scanner keyboard = new Scanner(System. in);
     
     System.out.print("How high schould I go? ");
     //Get the maximum value to display.
     
     int maxValue = keyboard.nextInt();
     
     System.out.println("Number     Number Squared");
     System.out.println("-------------------------");
     
     for (int number = 1; number <= maxValue; number++)
     {
         System.out.println(number + "\t\t" + number * number);
     }
    }
}