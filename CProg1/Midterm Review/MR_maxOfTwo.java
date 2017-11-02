//Constanza Cabrera
//10.15.15

public class MR_maxOfTwo
{
    public static void main(String[] args)
    {
        int a=0;
        int b=9;
        int c = maxOfTwo(a,b);
        System.out.print(c);
        return;
    }
    public static int maxOfTwo(int a, int b)
    {
        if (a>b)
            return a;
        else
            return b;
    }
}