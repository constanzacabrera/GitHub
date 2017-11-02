//Constanza Cabrera
//09.20.15

import java.util.Scanner;
import java.text.DecimalFormat;

public class Factorial
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System. in);
        System.out.println("This program will provide with the factorial ");
        System.out.println("of the number that you input.");

        int initial = 1;
        int factorial = 1;
        int numberOfTimes = 0;
        System.out.println("Please input a positive integer value.");
        int userInput = keyboard.nextInt();
        
        if (!(userInput>=1))
            {
                System.out.println("That is an invalid input. " +
                                    "Please try again.");
                userInput = keyboard.nextInt();
            }
        do
            {
            factorial *= initial;
            initial++;
            numberOfTimes = numberOfTimes + 1;
            }
        while (!(numberOfTimes==userInput));
        System.out.println(factorial + " is the factorial " + userInput);
        
    }
}
        
