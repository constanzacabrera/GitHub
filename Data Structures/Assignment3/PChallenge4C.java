// Programming Assignment 4
// @Team Name: Carrots
// >>Constanza Cabrera ID 1045549
// >>Hasib Ansari ID 1080351
// >>Joshua Folarin ID 0874110
//
// @date (02.14.2017)

package Assignment3;
import java.util.*;

public class PChallenge4C
{
   public static void main(String args[])
   {

       Stack CW = new Stack();

       System.out.println("Enter number of cars present: ");
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();

       for (int a = 1; a <= n; a += 1)
       {
           System.out.println("Enter license plate of vehicle: ");
           String LP = scan.next();
           CW.push(LP);
       }

       System.out.println("To view license plates, press 1.");
       int m = scan.nextInt();

       if (m > 0)
       {
           System.out.println("The license plates are: ");
           for (int a = 1; a <= n; a += 1)
           {
               System.out.println(CW.peek());
               CW.pop();
           }
       }

   }
}

