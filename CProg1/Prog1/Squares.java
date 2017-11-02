import java.util.Scanner;

public class Squares
{
    public static void main(String[] args)
    {
     Scanner keyboard = new Scanner(System. in);
     int number;
     
     System.out.println("Number     Number Squared");
     System.out.println("-------------------------");
     for (number = 1; number <= 5; number++)
       {
        System.out.println(number + "\t\t" + number * number);
       }
    }
}