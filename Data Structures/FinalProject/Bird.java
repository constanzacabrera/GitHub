package FinalProject;

public class Bird
{
    public static void main(String[] args) 
    {
        int[] a = new int[10];

        for(int i=0; i<a.length;i++)
            System.out.print(a[i]+ " ");
        System.out.println("");
        for(int i=0; i<a.length;i++)
        {a[i]=i+5;}
        for(int i=0; i<a.length;i++)
            System.out.print(a[i]+ " ");
        System.out.println("");
        for(int i = a.length-1; i>=0; i--)
            System.out.print(a[i]+ " ");
    }
}
