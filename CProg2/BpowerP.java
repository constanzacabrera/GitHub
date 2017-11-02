public class BpowerP
{
    public static void main(String[] args)
    {
        for (int i = 0; i <= 16; i++)
            System.out.println(BpowerP(2,i));
    }

    public static long BpowerP(int b, int p)
    {
        if (p==1)
            return b;
        if (p==0)
            return 1;
        else
            return b * BpowerP(b, p-1);
    }
}