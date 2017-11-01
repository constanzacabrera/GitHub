
// Programming Assignment 4
// @Team Name: Carrots
// >>Constanza Cabrera ID 1045549
// >>Hasib Ansari ID 1080351
// >>Joshua Folarin ID 0874110
//
// @date (02.14.2017)

package Assignment3;
import java.util.*;

public class Assignment4B
{
   public static void main (String args[])
   {

       Stack st = new Stack();

       st.push("FORD");
       st.push("CHEVY");
       st.push("HONDA");

       //checking three top objects

       System.out.println("Top object is: " +  st.peek());
       System.out.println("Elements after peek: " + st);
   }
}
