//Constanza Cabrera
//10.20.15

public class MR_MultiplicationTable
{
    public static void main(String[] args)
    {
        int a = 5;
        multiplicationTable(a);
        return;
    }

    public static void multiplicationTable(int a)
    {
        for (int b = 0; b<=a;b++)
        {
            for (int c=0; c<=a; c++)
            {
                int multiply = a*c+1;
                System.out.print(multiply+" ");
            }
            }
        return;
    }
}