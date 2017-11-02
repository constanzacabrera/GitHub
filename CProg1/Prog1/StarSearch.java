//Constanza Cabrera
//10.15.2015

import java.util.Scanner;
import java.lang.Math;

public class StarSearch
{   public static void main (String [] args) 
    {
        System.out.println("This is the talent competition " + 
            "score calculator.");
        System.out.println("You will enter the scores and I " + 
            "will give you the total.");

        double previousJudgeScore=0;

        System.out.print("Please input the score for the " + 
            "first judge: ");
        previousJudgeScore = getJudgeData(previousJudgeScore);
        double firstJudge=previousJudgeScore;
        System.out.print("Please input the score for the " + 
            "second judge: ");
        previousJudgeScore = getJudgeData(previousJudgeScore);
        double secondJudge=previousJudgeScore;
        System.out.print("Please input the score for the " +
            "third judge: ");
        previousJudgeScore = getJudgeData(previousJudgeScore);
        double thirdJudge=previousJudgeScore;
        System.out.print("Please input the score for the " + 
            "fourth judge: ");
        previousJudgeScore = getJudgeData(previousJudgeScore);
        double fourthJudge=previousJudgeScore;
        System.out.print("Please input the score for the " + 
            "fifth judge: ");
        previousJudgeScore = getJudgeData(previousJudgeScore);
        double fifthJudge=previousJudgeScore;

        double scoreAvgRecieved = calcScore(firstJudge, secondJudge, thirdJudge, fourthJudge, fifthJudge);

        System.out.print(scoreAvgRecieved + " is the score recieved for this star.");

        return;

    }

    public static double getJudgeData(double previousJudgeScore)
    {
        Scanner keyboard = new Scanner(System.in);
        previousJudgeScore = keyboard.nextDouble();
        while ((previousJudgeScore<0)||(previousJudgeScore>10))
        {
            System.out.println("Please enter a valid positive score less than 10: ");
            previousJudgeScore = keyboard.nextDouble();
        }
        return previousJudgeScore;
    }

    public static double calcScore(double firstJudge,
    double secondJudge, 
    double thirdJudge, 
    double fourthJudge, 
    double fifthJudge)
    {
        double scoreAvg;
        scoreAvg = (firstJudge+secondJudge+thirdJudge+fourthJudge+fifthJudge
            -findLowest(firstJudge, secondJudge, thirdJudge, fourthJudge, fifthJudge)
            -findHighest(firstJudge, secondJudge, thirdJudge, fourthJudge, fifthJudge))/3;
        return scoreAvg;
    }

    public static double findHighest(double firstJudge,
    double secondJudge, 
    double thirdJudge, 
    double fourthJudge, 
    double fifthJudge)
    {
        return Math.max(Math.max(Math.max(Math.max(firstJudge, secondJudge), thirdJudge), fourthJudge), fifthJudge);
    }

    public static double findLowest(double firstJudge,
    double secondJudge, 
    double thirdJudge, 
    double fourthJudge, 
    double fifthJudge)
    {
        return Math.min(Math.min(Math.min(Math.min(firstJudge, secondJudge), thirdJudge), fourthJudge), fifthJudge);
    }
}