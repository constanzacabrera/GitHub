//Constanza Cabrera
//11.17.15
import java.util.ArrayList;

public class ArrayListDemo1
{
    public static void main(String[] args)
    {
        //Create an ArrayList to hold some names.
        ArrayList<String> nameList = new ArrayList<String>();
        //Add some names to the ArrayList
        nameList.add("James");
        nameList.add("Catherine");
        nameList.add("Billy");
        nameList.add("Jennifer");
        //Display the items in nameList and their indices
        System.out.println("The ArrayList has "+ nameList.size() + 
                            " objects stored in it.");
        //Now display the items in the nameList
        for (int index = 0; index< nameList.size(); index++)
            System.out.println(nameList.get(index));
        System.out.println("");
        
        for (int index = 0; index<nameList.size(); index++)
            System.out.println("Index: " + index + " Name: " + 
                                nameList.get(index));
        System.out.println("");
        
        nameList.remove(1);
        System.out.println("The item at index 1 is removed." + 
                           " Here are the items now.");
        for (int index = 0; index<nameList.size(); index++)
            System.out.println("Index: " + index + " Name: " + 
                                nameList.get(index));    
    }
    /*
     * int n = find (nameList, "James");
     * 
     */
    public static int find(ArrayList<String> things)
    {
        int index = 0;
        return index //if found
        return -1 //if not found
    }
    public static int add(ArrayList<String> things)
    {
        int index = 0;
        return index //if found
        return -1 //if not found
    }
    public static int remove(ArrayList<String> index)
    {
        int index = 0;
        return index //if found
        return -1 //if not found
    }
    public static int get(ArrayList<String> index)
    {
        int index = 0;
        return index //if found
        return -1 //if not found
    }
    public static int size(ArrayList<String> things)
    {
        int index = 0;
        return index //if found
        return -1 //if not found
    }
    public static int set(ArrayList<String> things)
    {
        int index = 0;
        return index //if found
        return -1 //if not found
    }
}