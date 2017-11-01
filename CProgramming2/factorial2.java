public class factorial2

{
    public static void main(String[] args)
    {
        System.out.println(calc(4));
        System.out.println(calc(5));
        System.out.println(calc(6));
        System.out.println(calc(7));
    }

    public static long calc(long c)
    {
        if (c<=1)
            return 1;
        else
            return c * calc(c-1);
    }
}