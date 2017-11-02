//Computer Programming - 09.15.15
/*Write a program that computes the tax and tip on a restaurant bill. 
The program should ask the user to enter the charge for the meal. 
The tax should be 8.5 percent of the meal charge. The tip should be 15 
percent of the meal. Display the meal charge, tax mount, tip amount, and total bill on the screen.*/

import java.util.Scanner;

public class TestAvg
{
    public static void main(String[] args)
    {
        String testaverage;
        double testScore1;
        double testScore2;
        double testScore3;
        double averageTestScore;
       
        Scanner keyboard = new Scanner(System. in);
        
        System.out.print("Enter test score 1: ");
        testScore1 = keyboard.nextDouble();
        
        System.out.print("Enter test score 2: ");
        testScore2 = keyboard.nextDouble();
        
        System.out.print("Enter test score 3: ");
        testScore3 = keyboard.nextDouble();
       
        averageTestScore = (testScore1 + testScore2 + testScore3) / 3;
        System.out.println("You entered " + testScore1 + ", " + testScore2 + ", " + testScore3);
        System.out.println("Their average is " + averageTestScore);
                
    }
}
        
        
        