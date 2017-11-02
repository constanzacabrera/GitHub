import java.util.Scanner; 

public class Chap3_BooleanEx
{
    public static void main(String[] args)
    {
        int y;
        int x;
        
        Scanner keyboard = new Scanner(System. in);
        System.out.println("input a value for x");
        x = keyboard.nextInt();
        
        if (x > 100)
            y = 20;
            
        else
            y = 0;
        
       System.out.println("x = " + x + " y = " + y);
       
       return;
       
    }
}
            