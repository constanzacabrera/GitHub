// Programming Assignment 4
// @Team Name: Carrots
// >>Constanza Cabrera ID 1045549
// >>Hasib Ansari ID 1080351
// >>Joshua Folarin ID 0874110
//
// @date (02.14.2017)

package Assignment3;

import java.util.*;

public class PChallenge4B {
   public static void main(String args[]) {

       Stack SM = new Stack();

       System.out.println("Checkout: Enter number of items purchased");
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();

       for(int a = 1; a <= n; a += 1 )
       {
           System.out.println("Enter your purchased item: ");
           String item = scan.next();
           SM.push(item);
       }

       System.out.println("To view your checkout list, press 1.");
       int m = scan.nextInt();

       if(m > 0)
       {
           System.out.println("Your checkout items are: ");
           for(int a = 1; a <= n; a += 1 )
           {
               System.out.println(SM.peek());
               SM.pop();
           }
       }
      
   }
}
