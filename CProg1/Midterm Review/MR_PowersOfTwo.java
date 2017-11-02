//Constanza Cabrera
//10.15.15

import java.util.Scanner;
public class MR_PowersOfTwo
{
    public static void main(String[]args)
    {
        int n = 2;
        powersOfTwo(n);
    }

    public static int powersOfTwo(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
            sum = (int)Math.pow(2,i);
            System.out.print(sum + " ");
        }
        return sum;
    }
}