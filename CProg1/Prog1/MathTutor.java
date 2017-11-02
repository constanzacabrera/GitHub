//Constanza Cabrera
//09.20.15

import java.util.Scanner;

public class MathTutor
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System. in);
        
        System.out.println("I am your new math tutor. Please answer the following: ");
        
        int rnum1, rnum2;
        rnum1 = (int)(40.0*Math.random())+11;
        rnum2 = (int)(40.0*Math.random())+11;
        
        System.out.println("  " + rnum1);
        System.out.println("+ " + rnum2);
        System.out.println("_____");
        
        double answer = keyboard.nextDouble();
        
        while(!(answer == (rnum1 + rnum2)))
            {
                System.out.println("That is incorrect. Try again: ");
                answer = keyboard.nextDouble();
            }
        System.out.println("That is correct. Congratulations!");
    }
}