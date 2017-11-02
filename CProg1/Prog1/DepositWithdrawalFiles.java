//The numbers in the Deposits.txt file are the amounts of deposits 
//that were made to a  
//savings account during the month, and the numbers in the 
//Withdrawals.txt file are the 
//amounts of withdrawals that were made during the month. 
//Write a program that reads 
//both files and prints the sum of Deposits 
//and the sum of withdrawals.

import java.io.*; 
import java.util.Scanner;
public class DepositWithdrawalFiles
{
    public static void main(String[] args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the filename. The file is called 'deposits'. ");
        String deposits = keyboard.nextLine();

        File file = new File(deposits);
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext())
        {
            // Read the next name.
            String firstInputD = inputFile.nextLine();

            // Display the last name read.
            System.out.println(firstInputD);
        }
        
        inputFile.close(); 
        
        {
            System.out.println("Enter the filename. The file is called 'withdrawals'. ");
            String withdrawals = keyboard.nextLine();
        
            File file2 = new File(withdrawals);
            Scanner inputFile2 = new Scanner(file2);
                
        
            while (inputFile.hasNext())
                {
                    // Read the next name.
                    String firstInputW = inputFile.nextLine();
        
                    // Display the last name read.
                    System.out.println(firstInputW);
                }
        
                // Close the file.
            inputFile.close();
                       
            System.out.print("is the total.");
            }
    }
}