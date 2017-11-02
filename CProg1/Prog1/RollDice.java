import java.util.Scanner;
import java.util.Random;
public class RollDice
{
    public static void main (String[] args)
        {
        String again = "y"; 
        int die1;
        int die2;
        int total;
        int grandTotal=0;
        
        Scanner keyboard = new Scanner(System.in);
        
        Random rand = new Random();
        
        while (again.equalsIgnoreCase("y"))
            {
            System.out.println("Rolling the dice...");
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            System.out.println("Their values are: ");
            System.out.println(die1 + " " + die2);
            total = die1 + die2;         
            System.out.println("The total of the sum of the dice is " + total);
           
            System.out.println("Would you like to roll again (y = yes) ? ");
            again = keyboard.nextLine();
            
            grandTotal=grandTotal+total;
            System.out.println("The sum of all of the values rolled is " + grandTotal);
            }    
        }
}