//Constanza Cabrera
//09.20.15

import java.util.Scanner;

public class ChangeForADollarGame
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System. in);
        
        double Pennies;
            Pennies = 0.01;
        double Nickels;
            Nickels = 0.05;
        double Dimes;
            Dimes = 0.10;
        double Quarters;
            Quarters = 0.25;
            
        double userInputPennies;
        double userInputNickels;
        double userInputDimes;
        double userInputQuarters;
        double totalCoins;
        
        System.out.println("Let's play a game!");
        System.out.println("Enter a certain amount of each kind of coin and ");
        System.out.println("      I will tell you whether or not you made a dollar.");
        
        System.out.println("Please input a certain number of pennies.");
            userInputPennies = keyboard.nextDouble();
        
        System.out.println("Please input a certain number of nickels.");
            userInputNickels = keyboard.nextDouble();
        
        System.out.println("Please input a certain number of dimes.");
            userInputDimes = keyboard.nextDouble();

        System.out.println("Please input a certain number of quarters.");
            userInputQuarters = keyboard.nextDouble();
        
        totalCoins = (userInputPennies * Pennies) + (userInputNickels * Nickels) + (userInputDimes * Dimes) + (userInputQuarters * Quarters);
                
        if (totalCoins == 1.00)
        {
            System.out.println(userInputPennies + " pennies " + userInputNickels + " nickels " 
                                + userInputDimes + " dimes " + userInputQuarters + " quarters make a dollar! Congratulations!");
        }
        else if (!(totalCoins == 1.00))
        {
            System.out.println(userInputPennies + " pennies " + userInputNickels + " nickels " 
                                + userInputDimes + " dimes " + userInputQuarters + " quarters do not make a dollar!");
            System.out.println("Sorry!");
        }
    }   
}
        
