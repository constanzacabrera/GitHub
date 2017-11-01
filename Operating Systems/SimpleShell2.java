
import java.io.*;
import java.util.*;
public class SimpleShell2
{
    public static String separator = "\\";
    public static void main (String [] args) throws IOException
    {
        String commandLine;
        BufferedReader console = new BufferedReader (new InputStreamReader(System.in));
        String currentDirectory = System.getProperty("user.home");
        //we break out with <control><C>
        while(true)
        {
            //read what the user entered
            System.out.println("jsh>");
            commandLine = console.readLine();
            //if the user entered a return, just loop again
            if (commandLine.equals(" ")) continue;
            if (commandLine.equals("cd")){currentDirectory = System.getProperty("user.home"); continue;}

            StringTokenizer st = new StringTokenizer(commandLine);
            ArrayList<String> myCommands = new ArrayList<String>();

            //Command Storage
            while (st.hasMoreTokens()){myCommands.add(st.nextToken());}

            if (myCommands.get(0).contains("cd")){
                
                if (targetDirectory.contains("/")){
                    File file = new File(myCommands.get(1));
                    if (!file.exists())
                    {
                        System.out.println("Error: Invalid Directory");
                    }
                    currentDirectory = myCommands.get(1);
                }
                else 
                {
                    File file = new File(currentDirectory + "/" + myCommands.get(1));
                    if (!file.exists())
                    {
                        System.out.println("Error: Invalid Directory");
                    }
                    currentDirectory += "/" + myCommands.get(1);
                }
                continue;
            }

            try {
                ProcessBuilder pb = new ProcessBuilder(myCommands);
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
            
        }
    }
}
