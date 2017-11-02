//10.15.2015

import java.util.Scanner;
import java.lang.Math;

public class LowestScoreDrop
{   public static void main (String [] args) 
    {
        System.out.println("This program will provide with an average");
        System.out.println("of all test scores, dropping the lowest grade.");

        double previousScore=0;

        System.out.println("");
        System.out.println("Please input the score for the " + 
            "first test: ");
        previousScore = getScore(previousScore);
        letterGradeConversion(previousScore);
        double firstTest=previousScore;

        System.out.println("");
        System.out.println("Please input the score for the " + 
            "second test: ");
        previousScore = getScore(previousScore);
        letterGradeConversion(previousScore);
        double secondTest=previousScore;

        System.out.println("");
        System.out.println("Please input the score for the " +
            "third test: ");
        previousScore = getScore(previousScore);
        letterGradeConversion(previousScore);
        double thirdTest=previousScore;

        System.out.println("");
        System.out.println("Please input the score for the " + 
            "fourth test: ");
        previousScore = getScore(previousScore);
        letterGradeConversion(previousScore);
        double fourthTest=previousScore;

        System.out.println("");
        System.out.println("Please input the score for the " + 
            "fifth test: ");
        previousScore = getScore(previousScore);
        letterGradeConversion(previousScore);
        double fifthTest=previousScore;

        double scoreAvgRecieved = calcScore(firstTest, secondTest, thirdTest, fourthTest, fifthTest);

        System.out.println("");
        System.out.println("");
        System.out.println(scoreAvgRecieved + " is the average of the test scores.");

        double scoreAvgLetterGrade = letterGradeConversion(scoreAvgRecieved);

        return;
    }

    public static double getScore(double previousScore)
    {
        Scanner keyboard = new Scanner(System.in);
        previousScore = keyboard.nextDouble();
        while ((previousScore<0)||(previousScore>100))
        {
            System.out.println("Please enter a valid positive score less than or equal to 100: ");
            previousScore = keyboard.nextDouble();
        }
        return previousScore;
    }

    public static double calcScore(double firstTest,
    double secondTest, 
    double thirdTest, 
    double fourthTest, 
    double fifthTest)
    {
        double scoreAvg;
        scoreAvg = ((firstTest+secondTest+thirdTest+fourthTest+fifthTest-findLowest(firstTest, secondTest, thirdTest, fourthTest, fifthTest))/4);
        return scoreAvg;
    }

    public static double findLowest(double firstTest,
    double secondTest, 
    double thirdTest, 
    double fourthTest, 
    double fifthTest)
    {
        return Math.min(Math.min(Math.min(Math.min(firstTest, secondTest), thirdTest), fourthTest), fifthTest);
    }

    public static double letterGradeConversion(double previousScore)
    {
        double i = 0;
        while (i<1){
            if (previousScore < 60)
                System.out.println("This score is equivalent to a letter grade of F.");
            else if (previousScore < 70)
                System.out.println("This score is equivalent to a letter grade of D.");
            else if (previousScore < 80)
                System.out.println("This score is equivalent to a letter grade of C.");
            else if (previousScore < 90)
                System.out.println("This score is equivalent to a letter grade of B.");
            else if (previousScore <= 100)
                System.out.println("This score is equivalent to a letter grade of A.");
            i++;}
        return i;
    }

}