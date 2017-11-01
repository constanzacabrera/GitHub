
/**
* Programming Assignment 2B: ArrayList (cont.)
* 
* @Team Name: Carrots
* >>Constanza Cabrera ID 1045549
* >>Hasib Ansari ID 1080351
* >>Joshua Folarin ID 0874110
* 
* @date (02.07.2017)
* 
*/
package Assignment2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Assignment2B
{
   public static void main(String[] args) throws IOException
   {
       BufferedReader userInput = new BufferedReader
       (new InputStreamReader(System.in));
       ArrayList<String> myArr = new ArrayList<String>();
       myArr.add("Italian Riviera");
       myArr.add("Jersey Shore");
       myArr.add("Puerto Rico");
       myArr.add("Los Cabos Corridor");
       myArr.add("Lubmin");
       myArr.add("Coney Island");
       myArr.add("Karlovy Vary");
       myArr.add("Bourbon-l Archambault");
       myArr.add("Walt Disney World Resort");
       myArr.add("Barbados");
       
       System.out.println("Vacation Resort Advisor");
       System.out.println("Enter your name: ");
       String name = userInput.readLine();
       Integer nameLength = name.length();
       if (nameLength == 0)
       {
           System.out.println("empty name entered");
           return;
       }
       Integer vacationIndex = nameLength % myArr.size();
       
       System.out.println("\nYour name is "+name+ ", its length is " + nameLength + " characters, \n" + "that's why we suggest you go to " + myArr.get(vacationIndex));        
   }
}
