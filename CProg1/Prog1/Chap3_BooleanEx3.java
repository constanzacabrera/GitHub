//Write an if-else statement that assigns 1 to x when y is 
//equal to 100. Otherwise, it should assign 0 to x.

import java.util.Scanner;

public class Chap3_BooleanEx3
{
    public static void main(String[] args)
    {
        int x;
        int y;
        
        Scanner keyboard = new Scanner(System. in);
        System.out.println("Input a value for y");
        y = keyboard.nextInt();
        
        if (y == 100)
            x = 1;
            
        else 
            x = 0;
            
        System.out.println("x = " + x + " y = " + y);
        return;
        
    } 
}