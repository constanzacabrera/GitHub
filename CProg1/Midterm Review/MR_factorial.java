//Constanza Cabrera
//10.20.15

public class MR_factorial
{
    public static void main(String[] args)
    {
        int number=5;
        number = factorial(number);
        System.out.print(number);
        return;
    }
    public static int factorial(int number)
    {
        int i=1;
        int factorial=1;
        do
            {
                factorial*=i;
                i++;
            }
        while (!(i==(number+1)));        
        return factorial;
    }
}