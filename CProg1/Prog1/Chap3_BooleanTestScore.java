import java.util.Scanner;

public class Chap3_BooleanTestScore
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System. in);
        
        int testScore;
        
        System.out.println("Input your grade out of 100.");
        testScore = keyboard.nextInt();
        
        if (testScore < 60)
            System.out.print("Your grade is F.");
        else if (testScore < 70)
            System.out.print("Your grade is D.");
        else if (testScore < 80)
            System.out.print("Your grade is C.");
        else if (testScore < 90)
            System.out.print("Your grade is B.");
        else if (testScore <= 100)
            System.out.print("Your grade is A.");
        else 
            System.out.print("Invalid Score.");
        
        return;
        
    } 
}