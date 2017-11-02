import java.util.Scanner;

public class Chap4_5
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System. in);
        
        String yesOrNo;
        
        System.out.println("Please press either 'y' or 'n' on the keyboard.");
        yesOrNo = keyboard.nextLine();
        
        while (!(yesOrNo.equalsIgnoreCase("y")||(yesOrNo.equalsIgnoreCase("n"))))
           {
            System.out.println("Nay!");
            System.out.println("Now, try again, pressing the other letter.");
            yesOrNo = keyboard.nextLine();
           }
        
        System.out.println("Yay!");
    }
}