//Write a program with a loop that lets the user enter a series of integers, followed by -99
//to signal the end of the series. After all the numbers have been entered, the program
//should display the largest and smallest numbers entered.

import java.util.Scanner;
public class LargestSmallest
{   
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Let's play the Largest and Smallest Game");
        System.out.println("You will enter a series of integers.");
        System.out.println("And then enter '-99' to end the series.");
        System.out.println("I will display all of ");
        System.out.println("the numbers in a table.");
        System.out.println("Start typing; ");

        int userInputInteger1;
        int userInputInteger2;

        System.out.println("Largest" + "\t\t" + "Smallest");
        System.out.println("-------------------------");
        userInputInteger1 = keyboard.nextInt();

        do 
        {
            userInputInteger2 = keyboard.nextInt();
            if (!((userInputInteger1==-99) || (userInputInteger2==-99)))
            {
                if(userInputInteger1 > userInputInteger2)
                {  
                    System.out.println(userInputInteger1 + "\t\t" + userInputInteger2);                
                }
                else if (userInputInteger1 < userInputInteger2)
                {
                    System.out.println(userInputInteger2 + "\t\t" + userInputInteger1);
                }            
            }
            else if ((userInputInteger1==-99) || (userInputInteger2==-99))
            {
                System.out.print("You have terminated the program.");
                return;
            }
        }
        while (!(userInputInteger1==-99));
    }
}