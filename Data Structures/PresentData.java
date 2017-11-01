
/*
 * Programming Queue Assignment
 * Program To Recieve Commands to Show Specific Entry from Queue
 *
 * @Team Name: Carrots
 * >>Constanza Cabrera ID 1045549
 * >>Hasib Ansari ID 1080351
 * >>Joshua Folarin ID 0874110
 *
 * @date (02.28.2017)
 */

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.*;

public class PresentData {
    public static void main(String[] args) {

        Queue myQueue = new LinkedList();

        String textItem1 = "apples";
        String textItem2 = "bananas";
        String textItem3 = "carrots";
        String textItem4 = "dates";
        String textItem5 = "eggplants";

        myQueue.add(textItem1);
        myQueue.add(textItem2);
        myQueue.add(textItem3);
        myQueue.add(textItem4);
        myQueue.add(textItem5);

        System.out.println("This is a program created to recieve commands from the user");
        System.out.println("concerning which item the user would like to see from the queue:");
        System.out.println("----------------------------------------");
        System.out.println("This is the queue: " + myQueue);
        System.out.println(" ");
        System.out.println("Write '0' if you would like to specifically see entry 1.");
        System.out.println("Write '1' if you would like to specifically see entry 2.");
        System.out.println("Write '2' if you would like to specifically see entry 3.");
        System.out.println("Write '3' if you would like to specifically see entry 4.");
        System.out.println("Write '4' if you would like to specifically see entry 5.");
        System.out.println("Write '5' if you would not like to see any entry.");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 0)
        {
            System.out.println(myQueue.peek());
        }
        else if (i == 1)
        {
            for (int j = 0; j<i; j++)
                myQueue.remove();                
            System.out.println(myQueue.peek());
        }
        else if (i == 2)
        {
            for (int j = 0; j<i; j++)
                myQueue.remove();                
            System.out.println(myQueue.peek());
        }
        else if (i == 3)
        {
            for (int j = 0; j<i; j++)
                myQueue.remove();                
            System.out.println(myQueue.peek());
        }
        else if (i == 4)
        {
            for (int j = 0; j<i; j++)
                myQueue.remove();                
            System.out.println(myQueue.peek());
        }
        
    }
}