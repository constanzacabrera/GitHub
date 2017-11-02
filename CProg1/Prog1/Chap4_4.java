import java.util.Scanner;

public class Chap4_4
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System. in);
        
        int number;
        
        System.out.println("Please input a number from 10 through 24, inclusive.");
        number = keyboard.nextInt();
        
        while ((number>=10)&&(number<=24))
        {
            System.out.println("Well Done!");
            System.out.println("Please input another number from 10 through 24, inclusive.");
            number = keyboard.nextInt();
        }
        
        System.out.println("Incorrect Input!");
    }
}