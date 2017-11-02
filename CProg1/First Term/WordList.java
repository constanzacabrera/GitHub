//Constanza Cabrera
//11.24.15

import java.util.ArrayList;

public class WordList
{
    private ArrayList<String> myList; // contains Strings made up of letters
    // postcondition: returns the number of words in this WordList that
    // are exactly len letters long
    public int numWordsOfLength(int len)
    { /* to be implemented in part (a) */ 
        int count = 0;

        for(int k = 0; k < myList.size(); k++)
        {   
            String word = (String)myList.get(k);
            if(word.length() == len)
                count++;
        }
        return count;

        // Placed here so it compiles. You will replace it with your code.
    }
    // postcondition: all words that are exactly len letters long
    // have been removed from this WordList, with the
    // order of the remaining words unchanged

    public void removeWordsOfLength(int len)
    { /* to be implemented in part (b) */ 
        // ... constructor and other methods not shown
        for (int k = myList.size()-1; k>=0; k--)
        {
            String word = (String)myList.get(k);
            if(word.length() == len)
                myList.remove(k);
        }
    }

    public WordList()
    {
        myList = new ArrayList<String>();
    }

    public void ad(String str)
    {
        myList.add(str);
    }

    public String toString()
    {
        String st="[";
        for (int i=0; i<myList.size(); i++)
            st += "\""+myList.get(i)+"\",";

        String st1=st.substring(0, st.length()-1);
        return st1+"]";
    }
}