/**
 * Programming Assignment 2 Challenge
 * 
 * @Team Name: Carrots
 * >>Constanza Cabrera ID 1045549
 * >>Hasib Ansari ID 1080351
 * >>Joshua Folarin ID 0874110
 * 
 * @date (02.07.2017)
 * 
 * adds or removes an item from a 
 * linkedlist based on user input
 * you can use the index of the entry 
 * as the key to identify the
 * record for addition or deletion. 
 * display list contents after each operation
 * 
 */

package Assignment2;
import java.io.*;
import java.util.*;

public class PChallenge2 {
    public static void main(String args[]) {
        LinkedList<String> linkedlist = new LinkedList<String>();

        System.out.println("This is a program for a small phone directory");

        linkedlist.add("Adam: 347 123 4567");
        linkedlist.add("Joe: 516 456 9840");
        linkedlist.add("Barbara: 347 646 1082");
        linkedlist.add("Smith: 626 200 2000");
        linkedlist.add("Jennifer: 347 352 2253");

        System.out.println("PhoneDirectory Content: " + linkedlist);
        System.out.println("Write '1' if you would like to add an entry.");
        System.out.println("Write '0' if you would like to remove an entry.");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i == 1)
        {
            System.out.println("Input new entry");
            Scanner c = new Scanner(System.in);
            String j = c.nextLine();
            linkedlist.add(j);
            break;
        }
        while (i == 0)
        {
            System.out.println("Select an entry to remove.");
            Scanner s = new Scanner(System.in);
            int k = s.nextInt();
            System.out.println("Write '0' for the first entry, '1' for the second and so on... ");
            linkedlist.remove(k);
            break;
        }
        System.out.println("\nLinkedList Content after addition/removal: " + linkedlist);
    }
}
