//Constanza Cabrera
//Semester Project - Java Based Directory

import java.io.*;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

// Different directories are essential in order to provide the 
// right wording for the specific directory.

public class EmailDirectory extends DirectoryFile //Implemented from classwork
{
    private static String DATA_FILE_EMAILS = ".email_directory";
    //This is the name of the file in which the data is kept.
    //File is hidden on Unix-based computers, such as Linux and Mac OS X
    
    public void EmailDirectory(String dataName, String data){
        TreeMap<String, String>  emailDirectory;    
        // Phone directory data structure. Entries are in data name and data pairs.
        emailDirectory = new TreeMap<String,String>();
        // Creates a dataFile variable of type File to represent to be
        // stored in user's home directory
        File userHomeDirectory = new File( System.getProperty("user.home") );
        File dataFile = new File( userHomeDirectory, DATA_FILE_EMAILS);
        // Locates the file in user's home directory

        if ( ! dataFile.exists() ) {
            System.out.println("No email directory data file found.");
            System.out.println("A new one will be created.");
            System.out.println("File name:  " + dataFile.getAbsolutePath());
            // If no file found, creates a new file.
        }
        else {  // Precautionary code, avoids error
            System.out.println("Reading email directory data...");
            try {
                Scanner s = new Scanner( dataFile );
                while (s.hasNextLine()) {
                    String emailEntry = s.nextLine();
                    int positionSeparation = emailEntry.indexOf('%');
                    if (positionSeparation == -1)
                        throw new IOException("File is not a directory data file.");
                    dataName = emailEntry.substring(0, positionSeparation);
                    data = emailEntry.substring(positionSeparation+1);
                    emailDirectory.put(dataName,data);
                }
            }
            catch (IOException e) {
                System.out.println("Error in email directory data file.");
                System.out.println("File name:  " + dataFile.getAbsolutePath());
                System.out.println("This program cannot continue.");
                System.exit(1);
            }
        }

        Scanner in = new Scanner( System.in );
        boolean c = false;  
        // If directory changes, program notifies user at the end of the program.

        mainLoop: while (true) { // Command options given to user.
            System.out.println("\nSelect the action that you want to perform:");
            System.out.println("   1.  Look up an email.");
            System.out.println("   2.  Add or change an email.");
            System.out.println("   3.  Remove an entry from your email directory.");
            System.out.println("   4.  List the entire email directory.");
            System.out.println("   5.  Exit from the email directory.");
            System.out.println("Enter action number (1-5):  ");
            int command;
            if ( in.hasNextInt() ) {
                command = in.nextInt();
                in.nextLine();
            }
            else { // Avoids lack of interaction between user and program
                System.out.println("\nILLEGAL RESPONSE.  YOU MUST ENTER A NUMBER.");
                in.nextLine();
                continue;
            }
            switch(command) { // Depending on seleced option, actions are carried out.
                case 1:
                System.out.print("\nEnter the email provider associated with "); 
                System.out.print(" the email you want to look up: ");
                dataName = in.nextLine().trim().toLowerCase();
                data = emailDirectory.get(dataName);
                if (data == null)
                    System.out.println("\nSORRY, NO EMAIL FOUND FOR " + dataName);
                else
                    System.out.println("\nEMAIL FOR " + dataName + ":  " + data);
                break;
                case 2:
                System.out.print("\nEnter the email provider associated with the email: ");
                dataName = in.nextLine().trim().toLowerCase();
                if (dataName.length() == 0)
                    System.out.println("\nEMAIL PROVIDER CANNOT BE BLANK.");
                else if (dataName.indexOf('%') >= 0)
                    System.out.println("\nEMAIL PROVIDER CANNOT CONTAIN THE CHARACTER \"%\".");
                else { 
                    System.out.print("Enter email: ");
                    data = in.nextLine().trim();
                    if (data.length() == 0)
                        System.out.println("\nEMAIL CANNOT BE BLANK.");
                    else {
                        emailDirectory.put(dataName,data);
                        c = true;
                    }
                }
                break;
                case 3:
                System.out.print("\nEnter the email provider whose entry you want to remove: ");
                dataName = in.nextLine().trim().toLowerCase();
                data = emailDirectory.get(dataName);
                if (data == null)
                    System.out.println("\nSORRY, THERE IS NO ENTRY FOR " + dataName);
                else {
                    emailDirectory.remove(dataName);
                    c = true;
                    System.out.println("\nDIRECTORY ENTRY REMOVED FOR " + dataName);
                }
                break;
                case 4:
                System.out.println("\nLIST OF ENTRIES IN YOUR DIRECTORY:\n");
                for ( Map.Entry<String,String> entry : emailDirectory.entrySet() )
                    System.out.println("   " + entry.getKey() + ": " + entry.getValue() );
                break;
                case 5:
                System.out.println("\nExiting email directory.");
                break mainLoop;
                default:
                System.out.println("\nILLEGAL ACTION NUMBER.");
            }
        }
        
        // If the entries in directory have changed, prints out changes

        if (c) {
            System.out.println("Saving email directory changes to file " + 
                dataFile.getAbsolutePath() + " ...");
            PrintWriter output;
            try {
                output = new PrintWriter( new FileWriter(dataFile) );
            }
            catch (IOException e) { // Precautionary code, avoids error
                System.out.println("ERROR: Can't open data file for output.");
                return;
            }
            for ( Map.Entry<String,String> entry : emailDirectory.entrySet() )
                output.println(entry.getKey() + "%" + entry.getValue() );
            output.close();
            if (output.checkError())
                System.out.println("ERROR: Some error occurred while writing data file.");
            else
                System.out.println("Done.");
        }

    }
}