import java.io.*;
public class WriteToFile
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter outputFile = new PrintWriter("Names.txt"); 
        outputFile.println("Chris");
        outputFile.println("Kathryn");
        outputFile.println("Jean");
        outputFile.close();
    }
}
        