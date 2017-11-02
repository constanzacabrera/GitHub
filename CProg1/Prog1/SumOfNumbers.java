//Constanza Cabrera
//09.20.15

import java.util.Scanner;
import java.text.DecimalFormat;

public class SumOfNumbers
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System. in);
        System.out.println("This program will provide with the sum ");
        System.out.println("of all the integers from 1 up until ");
        System.out.println("the number that you input.");

        int initial = 1;
        int summation = 0;
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
            summation += initial;
            initial++;
            numberOfTimes = numberOfTimes + 1;
            }
        while (!(numberOfTimes==userInput));
        System.out.println(summation + " is the summation of all "
                            + "integers up to " + userInput);
        

    }
}
        