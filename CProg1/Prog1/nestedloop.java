import java.util.Scanner;

public class nestedloop
{
    public static void main(String[] args)
    {
        int rows;
        int cols;
        
        Scanner keyboard = new Scanner(System. in);
        System.out.print("Please input number of rows: ");
        rows = keyboard.nextInt();        
        System.out.print("Please input number of cols: ");
        cols = keyboard.nextInt();
        
        
        for (int r = 0; r <= rows; r++){
            for (int c = 0; c < cols; c++)
                System.out.print(" * ");
            System.out.println("");}
        /*
        rows = 4;
        for(int r = 0; r < rows; r++){
            for (int c = 0; c <= r;)
                System.out.print(" ");
            System.out.println(r);}
            */
    }
}