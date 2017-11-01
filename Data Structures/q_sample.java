
/*
 * Programming Queue Assignment
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
 
public class q_sample {
 
    public static void main(String[] args) {
 
        Queue myQueue = new LinkedList();
        myQueue.offer("Monday");
        myQueue.offer("Thursday");
 
        boolean flag = myQueue.offer("Wednesday");
 
        System.out.println("Wednesday inserted successfully? "+flag);
 
        try {
            myQueue.add("Thursday");
            myQueue.add("Friday");
            myQueue.add("Weekend");
 
        } catch (IllegalStateException e) {
 
            e.printStackTrace();
        }
 
        System.out.println("Pick the head of the queue: " + myQueue.peek());
        String head = null;
 
        try {
 
            head = (String) myQueue.remove();
            System.out.print("1) Push out " + head + " from the queue ");
            System.out.println("and the new head is now: "+myQueue.element());
 
        } catch (NoSuchElementException e) {
 
            e.printStackTrace();
 
        }
 
        head = (String) myQueue.poll();
        System.out.print("2) Push out " + head + " from the queue");
        System.out.println("and the new head is now: "+myQueue.peek());
 
        System.out.println("Does the queue contain 'Weekend'? " + myQueue.contains("Weekend"));
 
        System.out.println("Does the queue contain 'Monday'? " + myQueue.contains("Monday"));
    }
 
}
