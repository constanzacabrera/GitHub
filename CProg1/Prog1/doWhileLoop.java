import java.util.Scanner;

public class doWhileLoop
{
    public static void main(String[] args)
    {
     Scanner keyboard = new Scanner(System. in);
     int number;
        do
            {
            System.out.println("Enter a number in the range of 1 through 100: ");
            number = keyboard.nextInt();
            
            if (number<1||number>100)
                System.out.println("That number is invalid.");
            }
        while (number<1||number>100);
    }
}