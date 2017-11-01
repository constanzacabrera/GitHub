import java.util.Scanner;

public class FibonacciSequence
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Input a whole number.");
        int x = kb.nextInt();
        System.out.println("The Fibonacci Sequence Solution for your input is "+F(x));
        
    }

    public static long F(int n)
    {
        if (n==0)
        {
            return 0;
        }
        if (n==1)
        {
            return 1;
        }
        return F(n-1)+F(n-2);
    }
}