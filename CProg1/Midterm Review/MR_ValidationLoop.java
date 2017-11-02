//Constanza Cabrera
//10.15.2015

import java.util.Scanner;
public class MR_ValidationLoop{
    public static void main(String[] args)
    {
        System.out.println("This loop will ask for two numbers " +
            "that are not the same.");        
        int x=0;
        int y=0;

        Scanner keyboard = new Scanner(System.in);
        do 
        {
            System.out.println("Please enter the first number: ");
            x = keyboard.nextInt();
            System.out.println("Please enter a different number: ");
            y = keyboard.nextInt();
            if (x==y)
                System.out.println("Error.");
        }while (x==y);
        System.out.println("Well done.");
        
        return;
    }
}
