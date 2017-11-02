//Constanza Cabrera
//10.15.15

public class MR_SumRange
{
    public static void main(String[]args)
    {
        int num1=1;
        int num2=3;
        int sum = sumRange(num1, num2);
        System.out.print(sum);
        return;
    }
    public static int sumRange(int num1, int num2)
    {
        int sum = 0;
        for (int i = num1; i<=num2; i++)
        {
            sum+=i;
        }
        return sum;
    }
}