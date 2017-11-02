//Constanza Cabrera
//09.20.15
//Prog 3_1

import java.util.Scanner;

public class TestScoresAndGrade
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
        
        if (averageTestScore < 60)
            System.out.print("Your grade is F.");
        else if (averageTestScore < 70)
            System.out.print("Your grade is D.");
        else if (averageTestScore < 80)
            System.out.print("Your grade is C.");
        else if (averageTestScore < 90)
            System.out.print("Your grade is B.");
        else if (averageTestScore <= 100)
            System.out.print("Your grade is A.");
        else 
            System.out.print("Invalid Score.");
        
                
    }
}