import java.io.*;
import java.util.*;

public class IntegerRecursiveSearch
{
    public static void main() throws IOException
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter an integer to see if it is part of the file: ");
        int input = kb.nextInt();
        
        BufferedReader in = new BufferedReader(new FileReader("integernumbers.txt"));
        String s;
        List<Integer> list= new ArrayList<Integer>();
        while ((s=in.readLine())!=null)
            list.add(Integer.parseInt(s));
        Integer[]sortedArray=new Integer[list.size()];
        sortedArray = list.toArray(sortedArray);
        System.out.println(Arrays.toString(sortedArray));
        int v = recBinSearch(sortedArray, 0, sortedArray.length -1, input);
        if (v>=0)
            System.out.println("The number is in the file. It is located at the " + v + " index.");
        else
            System.out.println("The number is not in the file");
    }
    public static int recBinSearch(Integer[] sortedArray, int s, int e, int k)
    {
        if(s<e)
            {
                int m = s + (e+s)/2;
                if (k<sortedArray[m])
                    return recBinSearch(sortedArray, s, m, k);
                else if (k>sortedArray[m])
                    return recBinSearch(sortedArray, m+1, e, k);
                else
                    return m;
            }
        return -(s+1);
    }
}
