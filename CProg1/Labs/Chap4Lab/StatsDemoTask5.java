//Constanza Cabrera
//10.06.15

import java.text.DecimalFormat; //for number formatting
import java.util.Scanner;       //for keyboard input
import java.io.*;               //for using files

public class StatsDemoTask5
{
    public static void main(String [] args) throws IOException
    {
        double sum = 0;     //the sum of the numbers
        int count = 0;      //the number of numbers added
        double mean = 0;    //the average of the numbers
        double stdDev = 0;  //the standard deviation of the numbers
        String line;        //a line from the file
        double difference;  //difference between the value and the mean

        //create an object of type Decimal Format
        DecimalFormat threeDecimals = new DecimalFormat("0.000");
        //create an object of type Scanner
        Scanner keyboard = new Scanner (System.in);
        String filename;    // the user input file name

        //Prompt the user and read in the file name
        System.out.println("This program calculates statistics"
            + " on a file containing a series of numbers");
        System.out.print("Enter the file name:  ");
        filename = keyboard.nextLine();

        //ADD LINES FOR TASK #4 HERE
        File myfile = new File(filename);
        Scanner inputFile = new Scanner(myfile);
        //priming read to read the first line of the file
        double lineNum;
        while (inputFile.hasNext())
        {
            lineNum = inputFile.nextDouble();
            System.out.println(lineNum);
            sum = sum + lineNum;
            count++;
        }
        inputFile.close();
        
        System.out.println(sum + " = Sum");
        mean = sum / count;
        System.out.println(mean + " = Mean");

        //ADD LINES FOR TASK #5 HERE
        myfile = new File(filename);
        inputFile = new Scanner(myfile);
        
        sum = 0;
        count = 0;
        //priming read to read the first line of the file
        while (inputFile.hasNext())
        {
            lineNum = inputFile.nextDouble();
            System.out.println(lineNum);
            difference=lineNum-mean;
            sum = sum + (difference*difference);
            count++;
        }
        inputFile.close();
        stdDev=Math.sqrt(sum/count);
        System.out.println(stdDev + " = Standard Deviation");

        //ADD LINES FOR TASK #3 HERE
        PrintWriter outputFile = new PrintWriter("Results.txt"); 
        outputFile.println(mean + " = Mean");
        outputFile.println(stdDev + " = Standard Deviation");
        outputFile.close();
    }
}