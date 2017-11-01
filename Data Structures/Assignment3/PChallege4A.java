// Programming Assignment 4
// @Team Name: Carrots
// >>Constanza Cabrera ID 1045549
// >>Hasib Ansari ID 1080351
// >>Joshua Folarin ID 0874110
//
// @date (02.14.2017)

package Assignment3;

import java.util.*;
import java.util.Scanner;

public class PChallege4A {
   public static void main(String args[]){

       Stack ToDo = new Stack();

       System.out.println("Please input the task you would like to have added to the list");

       Scanner scan = new Scanner(System.in);
       String x = scan.nextLine();
       ToDo.push(x);

       System.out.println("Would you like to add more tasks? 1 for yes, 0 for no");
       int i = scan.nextInt();
       if (i>0)
       {
           System.out.println("Input next task");
           String xi = scan.next();
           ToDo.push(xi);
           while(i==1)
           {
               System.out.println("Would you like to add more tasks? 1 for yes, 0 for no");
               int j = scan.nextInt();
               if (j > 0)
               {
                   System.out.println("Input next task");
                   String xii = scan.next();
                   ToDo.push(xii);
               }
               else
               {
                   break;
               }
               System.out.println("Added task is: " + ToDo.peek());
               System.out.println("Your tasks for the day: " + ToDo);
           }
       }
       else
       {
           System.out.println("Added task is: " + ToDo.peek());
           System.out.println("Your tasks for the day: " + ToDo);
       }
   }
}