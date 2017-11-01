/*
 * Programming Assignment 5
 *
 * @Team Name: Carrots
 * >>Constanza Cabrera ID 1045549
 * >>Hasib Ansari ID 1080351
 * >>Joshua Folarin ID 0874110
 *
 * @date (02.27.2017)
 */

import java.util.*;
public class FundRaiser {
    public static int c;
    public static void main(String args[]){

        LinkedList<String> LastName = new LinkedList<String>();

        Stack items = new Stack();
        
        System.out.println("This is a program to let you donate items to ");
        System.out.println("impoverished families in your hometown.");
        System.out.println(" ");
        System.out.println("DONATION SYSTEM");
        System.out.println("----------------------------------------");

        Scanner scan = new Scanner(System.in);
        int n = 1;
        {
            System.out.println("Please enter the family last name: ");
            String name = scan.next();
            String UCname = name.toUpperCase();
            LastName.add(UCname);
        }

        System.out.println("This is the family you will be donating to: " + LastName);

        for (int b = 0; b <= n-1; b += 1 )
        {
            System.out.println("How many items will you get for the " + LastName.get(b) + " family?");
            c = scan.nextInt();
            System.out.println("Please enter the item names below: ");
            for (int d = 1; d <= c; d += 1)
            {
                String itemName = scan.next();
                String UCitemName = itemName.toUpperCase();
                items.push(UCitemName);
            }
        }

        System.out.println(" ");
        System.out.println("DONATION SYSTEM");
        System.out.println("---------------");

        for (int b = 0; b <= n-1; b += 1 )
        {
            System.out.println(LastName.get(b) + " FAMILY");
            for (int e = 1; e <= c; e += 1)
            {
                System.out.println("* " + items.pop());
            }
        }
    }
}
