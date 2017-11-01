
// Programming Assignment 4
// @Team Name: Carrots
// >>Constanza Cabrera ID 1045549
// >>Hasib Ansari ID 1080351
// >>Joshua Folarin ID 0874110
//
// @date (02.14.2017)

package Assignment3;
import java.util.*;
public class Assignment4A
{
   public static void main(String args[])
   {

       Stack CSC260st = new Stack();

       CSC260st.push("NYC");
       CSC260st.push("OLD WESTBURY");
       CSC260st.push("VANCOUVER");
       CSC260st.push("NANJING");
       CSC260st.push("CENTRAL ISLIP");
       CSC260st.push("ABU DHABI");
       CSC260st.push("JONESBORO");

       System.out.println("Removed object is:  " + CSC260st.pop());
       System.out.println("Elements after remove: " + CSC260st);
   }
}
