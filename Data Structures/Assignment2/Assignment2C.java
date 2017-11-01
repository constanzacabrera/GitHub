/*
* Programming Assignment 2C: Linked List 
* 
* @Team Name: Carrots
* >>Constanza Cabrera ID 1045549
* >>Hasib Ansari ID 1080351
* >>Joshua Folarin ID 0874110
* 
* @date (02.07.2017)
*/

package Assignment2;
import java.util.*;

public class Assignment2C {
  public static void main(String args[]) {

      LinkedList<String> linkedlist = new LinkedList<String>();

      linkedlist.add("Item1");
      linkedlist.add("Item5");
      linkedlist.add("Item3");
      linkedlist.add("Item6");
      linkedlist.add("Item2");

      System.out.println("Linked List Content: " +linkedlist);

      linkedlist.addFirst("First Item");
      linkedlist.addLast("Last Item");

      System.out.println("\nLinkedList Content after addition: " + linkedlist);

      Object firstvar = linkedlist.get(0);
      System.out.println("\nFirst element: " + firstvar);
      linkedlist.set(0, "Changed first item");
      Object firstvar2 = linkedlist.get(0);
      System.out.println("\nFirst element after update by set method: " + firstvar2);

      linkedlist.removeFirst();
      linkedlist.removeLast();
      System.out.println("\nLinkedList after deletion of first and last element: " + linkedlist);

      linkedlist.add(0, "Newly added item");
      linkedlist.remove(2);
      System.out.println("\nFinal content: " + linkedlist);
  }
}
