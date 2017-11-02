//Constanza Cabrera
//11.3.15

/*
    ___________________________________________________________
   |                                                           |
   |   BlackJack  	                                           | 
   |___________________________________________________________|
   |                                                           |
   | + playGameAgain() : boolean                               |
   | + computerChoice(computerTotal:int, randomNum:int) : int  |
   | + result(computerTotal:int, userTotal:int) : void 	       |
   | + playGameAgain2() : boolean                              |
   |___________________________________________________________|

*/

import java.util.Random;  
import java.util.Scanner;
public class BlackJack
{
    public static void main(String [] args)
    {
        Die firstGame = new Die(10);
        int randomNum = firstGame.getValue();
        do
        {
            Random rand = new Random ();
            System.out.println("Let's play a game of BlackJack");
            int userTotal=0;
            int sumNum=0;
            int computerTotal=0;
            int userNum = randomNum + randomNum;
            do
            {
                computerTotal = computerChoice(computerTotal, randomNum);
                userTotal = userTotal + randomNum; 
                System.out.println("User got " + userTotal);
                System.out.println("Dealer got " + computerTotal);
            }
            while(playGameAgain());
            result(computerTotal, userTotal);
            System.out.println("");
            System.out.println("");
        }
        while(playGameAgain2());
    }

    public static boolean playGameAgain()
    {
        String play_Again;
        do
        {
            Scanner kb = new Scanner (System.in);
            System.out.print("Do you want to continue (Yes/No)?:  ");
            play_Again = kb.nextLine();
            System.out.println("");
        }
        while(!play_Again.equalsIgnoreCase("yes")&&!play_Again.equalsIgnoreCase("no"));
        if (!play_Again.equalsIgnoreCase("yes"))
            return false;
        else 
            return true;
    }

    public static int computerChoice(int computerTotal, int randomNum)
    {
        while (computerTotal<=17)
        { 
            int computerNum = randomNum;
            computerTotal = computerTotal + computerNum;
        }
        return computerTotal;
    }

    public static void result(int computerTotal, int userTotal)
    {
        if (computerTotal==userTotal)
            System.out.println("It's draw, dealer got " + computerTotal+ " and you got " + userTotal);
        else if (userTotal==21)
            System.out.println("You win, dealer got " + computerTotal + " and you got " + userTotal);
        else if(computerTotal<=21&&userTotal<=21)
        {
            if((21-computerTotal)<(21-userTotal))
                System.out.println("Dealer wins, they got " + computerTotal+ " and you got " + userTotal);
            else
                System.out.println("You win, dealer has " + computerTotal + " and you got " + userTotal);
        }   
        else if (computerTotal<=21&&userTotal>=21)
            System.out.println("Dealer wins, he has " + computerTotal+ " and you got " + userTotal);
        else if(computerTotal>=21&&userTotal<=21)
            System.out.println("You win, dealer has " + computerTotal + " and you got " + userTotal);
        System.out.println("");
    }

    public static boolean playGameAgain2()
    {
        String playGameAgain2;

        do
        {
            Scanner kb = new Scanner (System.in);
            System.out.print("Do you want to play again (Yes/No)?:  ");
            playGameAgain2 = kb.nextLine();
        }
        while(!playGameAgain2.equalsIgnoreCase("yes")&&!playGameAgain2.equalsIgnoreCase("no"));

        if (!playGameAgain2.equalsIgnoreCase("yes"))
            return false;
        else 
            return true;
    }
}