//Constanza Cabrera
//10.15.15

public class MR_average
{
    public static void main(String[] args)
    {
        int a=1;
        int b=2;
        int c=3;
        double average = average(a, b, c);
        System.out.print(average);
        return;
    }
    public static double average(int a, int b, int c)
    {
        double average = ((a+b+c)/3);
        return average;
    }
}