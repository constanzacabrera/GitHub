//Constanza Cabrera
//10.08.15
import java.util.Scanner;

public class Markup
{
    public static void main()
    {
        double wholesalePrice, markupRate, retailPrice;
        Scanner kb = new Scanner(System.in);
        
        System.out.print("Enter the wholesale price: ");
        wholesalePrice=kb.nextDouble();
        
        System.out.print("Enter the markup rate (0.10 for 10%) ");
        markupRate=kb.nextDouble();
        retailPrice=calculateRetail(wholesalePrice, markupRate);
        System.out.println("The retail price is "+retailPrice);
    }
    public static double calculateRetail(double wsPrice, double mrkpRate)
    {
        double result;
        result=wsPrice+wsPrice*mrkpRate;
        return result;
    }
    public static double getPositive()
    {
        Scanner kb=new Scanner(System.in);
        double num;
        do 
        {
            System.out.print("Enter a positive value ");
            num = kb.nextDouble();
        }while (num<0);
        return num;
    }
}