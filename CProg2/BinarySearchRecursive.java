import java.util.Scanner;
public class BinarySearchRecursive 
{
    private int binarySearch(int [] a, int x, int l, int h)
    {
        if (l>h)
            return -1;
        int m = (l+h)/2;
        if (a[m]==x)
            return m;
        else if (a[m]<x)
            return binarySearch(a, x, m+1, h);
        else
            return binarySearch(a, x, l, m-1);
    }
    
    public int binarySearch(int[] a, int x) 
    { 
        return binarySearch(a, x, 0, a.length - 1);
    }
    
    public static void main(String[] args)
    {
        BinarySearchRecursive bin = new BinarySearchRecursive();
        int[] a1 = {2, 4, 6, 8, 14, 16, 20, 25, 33};
        Scanner kb = new Scanner(System.in);
        System.out.println("Please input a number to see if it is in the index.");
        int i = kb.nextInt();
        System.out.println();
        int k = bin.binarySearch(a1,i);
        if(k==1)
        {
            System.out.println("Yes");
        }
        else
            System.out.print("No");
    }
}
    