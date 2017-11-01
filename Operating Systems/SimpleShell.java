/**
 * Project # 2: Creating a Shell Interface Using Java
 * 
 * @author (Constanza Cabrera, ID 1045549) 
 * @class (Operating Systems, CSCI 330)
 */
import java.io.*;
import java.util.*;
public class SimpleShell
{
    public static String separator = "\\";
    public static void main (String [] args) throws IOException
    {
        String commandLine;
        BufferedReader console = new BufferedReader (new InputStreamReader(System.in));
        String currentDirectory = System.getProperty("user.home");

        //File current_dir = new File(new File(".").getAbsolutePath());
        //File home_dir = new File(System.getProperty("user.home"));

        //we break out with <control><C>
        while(true)
        {
            //read what the user entered
            System.out.print("jsh>");
            commandLine = console.readLine();
            ProcessBuilder pb = new ProcessBuilder();
            //if the user entered a return, just loop again
            if (commandLine.equals(" "))
                continue;
            if (commandLine.equals("cd"))
            {current_dir = home_dir; continue;}

            StringTokenizer st = new StringTokenizer(commandLine);
            ArrayList<String> myCommands = new ArrayList<String>();

            //Command Storage
            while (st.hasMoreTokens()){myCommands.add(st.nextToken());}

            if (myCommands.contains("cd")){
                if (myCommands.equals("cd")){
                    File home = new File(System.getProperty("user.home"));
                    System.out.println("The home directory is " + home);
                    pb.directory(home);
                    continue;
                }
                else if (myCommands.equals("cd ~"))
                {}
                else if (myCommands.equals("cd .."))
                {}
                else if (myCommands.equals("cd ../.."))
                {}
                else if (myCommands.equals("cd /"))
                {}
                // - - - - - - - - - - - - - - - - - - 
                else if (myCommands.equals("history"))
                {}
                else if (myCommands.equals("!!"))
                {}
                else if (myCommands.equals("!"+i))
                {}
                else{
                    String argument = myCommands.get(myCommands.size()-1);
                    System.out.println("The argument passed is " + argument);
                    String createPath =  pb.directory() + separator + argument;
                    System.out.println("The path created  is " + createPath);
                    File newPath = new File(createPath);
                    pb.directory(newPath);
                    continue;
                }
            }
            /*
            try {
            pb.directory(new File(currentDirectory));
            Process process = pb.start();
            process.waitFor();

            BufferedReader inProcess = new BufferedReader (new InputStreamReader(System.in));     
            String outputLine = inProcess.readLine();
            while(outputLine != null)
            { System.out.println(outputLine);
            outputLine = inProcess.readLine();
            }

            }catch (Exception e){System.out.println("Error: "+ e.getMessage());}
             */

            // Create the Process builder object
            pb.command(myCommands);
            // Now start the process
            Process process = pb.start();
            // Obtain the output stream
            InputStream is = process.getInputStream();
            // Read what the process returned
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line;
            while ((line = br.readLine()) != null){
                // Content returned by the command
                System.out.println(line);
            }//while
            br.close();

        }
    }

    {
    }
}

