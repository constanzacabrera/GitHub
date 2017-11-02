import java.util.Scanner;

public class Checkpoint
{
    public static void main(String[] args)
   {
       int x;
       int y;
       x=2;
       y=x++;
       System.out.println(y);
       
       x=2;
       System.out.println(x++);
       
       x=2;
       System.out.println(--x);
       
       x=8;
       y=x--;
       System.out.println(y);
   }
}