import java.util.Scanner;

public class Chap4_6
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System. in);
        
        String yesOrNo;
        
        System.out.println("Please enter either 'yes' or 'no' on the keyboard.");
        yesOrNo = keyboard.nextLine();
        
        while (!(yesOrNo.equalsIgnoreCase("yes")||(yesOrNo.equalsIgnoreCase("no"))))
           {
            System.out.println("Nay!");
            System.out.println("Now, try again, writing the other word.");
            yesOrNo = keyboard.nextLine();
           }
        
        System.out.println("Yay!");
    }
}