//Constanza Cabrera
//10.15.2015

import java.util.Scanner;

public class isPrime
{   public static void main (String [] args) 
    {
        System.out.println("This program will tell you whether " + 
            "or not a number is prime.");
        System.out.println("");  
        System.out.println("A prime number is an integer greater than 1 "); 
        System.out.println("that is evenly divisible by only 1 and itself.");
        System.out.println("");
        System.out.println("Let's try this out.");
        System.out.println("Please give me a whole number: ");

        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        boolean answer = isPrime(num);

        if (answer==false)
            System.out.print("This is not a prime number.");
        else if (answer==true)
            System.out.print("This is a prime number.");

        return;
    }

    public static boolean isPrime(int num)
    {
        for (int i=2; i<=num/2; i++)
        {
            if (num%i==0)
                return false;
        }
        return true;
    }
}
