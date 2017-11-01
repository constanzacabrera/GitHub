/**
* Programming Assignment 2A: ArrayList 
* 
* @Team Name: Carrots
* >>Constanza Cabrera ID 1045549
* >>Hasib Ansari ID 1080351
* >>Joshua Folarin ID 0874110
* 
* @date (02.07.2017)
**/
package Assignment2;
import java.util.*;
public class Assignment2A {
   public static void main(String[] args) {
       ArrayList<String> obj = new ArrayList<String>();
       obj.add("Bob");
       obj.add("Mary");
       obj.add("John");
       obj.add("Amy");
       obj.add("Steve");
       System.out.println("Currently the array list has following elements:"+obj);
       obj.add(4, "Ann");
       obj.add(1, "Tim");
       obj.remove("Charles");
       obj.remove("Harry");
       System.out.println("Current array list is:"+obj);
       obj.remove(1);
       System.out.println("Current array list is:"+obj);
   }
}
