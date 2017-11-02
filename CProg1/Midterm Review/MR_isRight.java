//Constanza Cabrera
//10.15.15

import java.lang.Math;
public class MR_isRight
{
    public static void main(String[] args)
    {
        System.out.print(isRight(5, 3, 4));

        return;
    }

    public static boolean isRight(double h, int a, int b)
    {
        double answer1 = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        double answer2 = Math.sqrt(Math.pow(b,2)+Math.pow(h,2));
        double answer3 = Math.sqrt(Math.pow(a,2)+Math.pow(h,2));
        
        if (h==answer1||a==answer2||b==answer3)
            return true;
        else
            return false;
    }
}