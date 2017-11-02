import java.util.Scanner;
import java.util.Random;
public class HeadAndTails
{
    public static void main (String[] args)
    {
        String again = "y"; 
        int heads = 0;
        int tails = 0;
        int coinFlip;
        int i = 0;

        Scanner keyboard = new Scanner(System.in);

        Random rand = new Random();

        for (int count = 1; count<10; count++)
        {
            System.out.println("Flipping the coin...");
            if(rand.nextInt(2) == 0)
            {
                System.out.println("Tails");
                tails++;
            }
            else
            {
                System.out.println("Heads");
                heads++;
            }
            System.out.println(heads + " Heads and " + tails + " tails.");
        }
    }
}