//Constanza Cabrera
//Semester Project - Java Based Directory

import java.io.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
//Imports all libraries necessary for program.

/**
 * 
 * This program provides users with a directory that branches out into
 * several subdirectories. Data has been included to maintain a
 * phone directory, a password directory, an email directory
 * and to create a new directory for the users manipulation.
 * All files are stored in a specific location in the user's home directory.
 * 
 */

public class DirectoryFile {
    public static String dataName, data;
    // Data Name and Data Input of an entry in the directory (used at various places in the program).

    public static void main(String[] args) {
        System.out.println("Hi there!");
        System.out.println("This is your personal directory database.");
        System.out.println("Please select which directory you would like to use.");
        System.out.println("There are three preselected directory options. You may create 2 of your own.");
        
        Scanner in = new Scanner( System.in );
        boolean c = false;  // If changes are made, this will let the program know to show this at the end.

        mainLoop: while (true) { //Go to loop, (first loop the program goes to)
            // Introduces user to the program. Gives them instructions.
            System.out.println("\nSelect the directory you would like to use:");
            System.out.println("   1.  Phone Directory.");
            System.out.println("   2.  Password Directory.");
            System.out.println("   3.  Email Directory.");
            System.out.println("   4.  Personalized Directory 1.");
            System.out.println("   5.  Personalized Directory 2.");
            System.out.println("   6.  Exit the program.");
            System.out.println("Enter action number (1-6):  ");
            int input;
            if (in.hasNextInt() ) { //Prevents user from not inputing a number. Keeps the user-program interaction consistent.
                input = in.nextInt();
                in.nextLine();
            }
            else {
                System.out.println("\nILLEGAL RESPONSE.  YOU MUST ENTER A NUMBER.");
                in.nextLine();
                continue;
            }
            switch(input) { 
                //Depending on the selection by the user, a specific program will be used. Constructors implemented.
                // Broken down into a switch/case code for organization purposes. 
                case 1:
                PhoneDirectory aa = new PhoneDirectory();
                aa.PhoneDirectory(dataName, data);
                break;

                case 2:
                PasswordDirectory bb = new PasswordDirectory();
                bb.PasswordDirectory(dataName, data);
                break;

                case 3:
                EmailDirectory cc = new EmailDirectory();
                cc.EmailDirectory(dataName, data);
                break;

                case 4:
                New1Directory dd = new New1Directory();
                dd.New1Directory(dataName, data);
                break;

                case 5:
                New2Directory ee = new New2Directory();
                ee.New2Directory(dataName, data);
                break;

                case 6:
                System.out.println("\nExiting program.");
                break mainLoop;
                
                default: //If an option that is not presented is selected, this stops the users action. 
                System.out.println("\nILLEGAL ACTION NUMBER.");
            }
        }
        //Program will loop inside specific directory until use of directory finishes. 
        //Program will then loop inside directory database until use of directory finishes.
    }

}