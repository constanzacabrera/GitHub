//Constanza Cabrera
//10.02.15

import java.util.Random;
import java.util.Scanner;
public class RandomNumberGuessing
{   
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Let's play the Random Number Guessing Game");
        System.out.println("I'm thinking of a number between 0 and 100.");
        System.out.println("You will guess a number and ");
        System.out.println("I will tell you if you have");
        System.out.println("to go higher or go lower.");

        Random rand = new Random();
        int computerGeneratedInteger = rand.nextInt(100);

        System.out.println("Start guessing; ");
        int userGuessedInteger = keyboard.nextInt();
        int guessCount=0;

        while (!(computerGeneratedInteger==userGuessedInteger))
        {
            if(computerGeneratedInteger > userGuessedInteger)
            {  
                System.out.println("Go Higher!");
                guessCount++;
                userGuessedInteger = keyboard.nextInt();
            }
            else if (computerGeneratedInteger < userGuessedInteger)
            {
                System.out.println("Go lower!");
                guessCount++;
                userGuessedInteger = keyboard.nextInt();
            }
        }
        System.out.println("Good Job! You got the answer " + computerGeneratedInteger + " in " + guessCount + " tries!");
    }
}