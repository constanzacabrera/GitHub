//Constanza Cabrera
//10.05.15

import java.util.Random;
import java.util.Scanner;
public class RockPaperScissors
{   
    public static void main (String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Let's play Rock-Paper-Scissors");
        System.out.println("You type in Rock, Paper or Scissors");
        System.out.println("I will tell you what I thought");
        System.out.println("And if you or I won.");
        System.out.println("Type 'exit' to end the game.");

        Random rand = new Random();
        int computerGeneratedInteger = rand.nextInt(3);

        int rock = 2;
        int paper = 1;
        int scissors = 0;

        System.out.println("Type in your decision: ");
        String userInput = keyboard.nextLine();
        while (!(userInput.equalsIgnoreCase("Rock")||userInput.equalsIgnoreCase("Paper")||userInput.equalsIgnoreCase("Scissors")))
        {
            if (userInput.equalsIgnoreCase("Exit"))
            {
                System.out.print("You ended the game.");
                return;
            }
            else
            {
                System.out.println("That is an invalid input. Please try again:");
                userInput = keyboard.nextLine();
            }
        }
        if (userInput.equalsIgnoreCase("Rock")||userInput.equalsIgnoreCase("Paper")||userInput.equalsIgnoreCase("Scissors"))
        {
            if ((userInput.equalsIgnoreCase("Rock")) && (computerGeneratedInteger == rock)) 
                System.out.print("I also chose rock. It's a draw!");
            else if ((userInput.equalsIgnoreCase("Rock")) && (computerGeneratedInteger == scissors)) 
                System.out.print("I chose scissors. You won!");
            else if ((userInput.equalsIgnoreCase("Rock")) && (computerGeneratedInteger == paper)) 
                System.out.print("I chose paper. I won!");
            else if ((userInput.equalsIgnoreCase("Paper")) && (computerGeneratedInteger == paper))
                System.out.print("I also chose paper. It's a draw!");
            else if ((userInput.equalsIgnoreCase("Paper")) && (computerGeneratedInteger == rock)) 
                System.out.print("I chose rock. You won!");
            else if ((userInput.equalsIgnoreCase("Paper")) && (computerGeneratedInteger == scissors)) 
                System.out.print("I chose scissors. I won!");
            else if ((userInput.equalsIgnoreCase("Scissors")) && (computerGeneratedInteger == scissors))
                System.out.print("I also chose scissors. It's a draw!");
            else if ((userInput.equalsIgnoreCase("Scissors")) && (computerGeneratedInteger == rock)) 
                System.out.print("I chose rock. I won!");
            else if ((userInput.equalsIgnoreCase("Scissors")) && (computerGeneratedInteger == paper)) 
                System.out.print("I chose paper. You won!");
        }
    }
}