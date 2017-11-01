/**
 * Programming Assignment 2D: LinkedList 2
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
import java.util.LinkedList;
import java.util.*;
public class Assignment2D
{
    public static void main(String[] args)
    {
        LinkedList<String> 1List = new LinkedList<String>();
        1List.add("1");
        1List.add("2");
        1List.add("3");
        1List.add("4");
        1List.add("5");

        System.out.println("LinkedList contains : " + 1List);
        Object object = 1List.removeFirst();
        System.out.println(object + " has been removed from the first index of LinkedList");
        System.out.println("LinkedList now contains : " + 1List);

        object = 1List.removeLast()
        System.out.println(object + " has been removed from the last index of LinkedList");

        System.out.println("LinkedList now contains : " + 1List);
    }
}