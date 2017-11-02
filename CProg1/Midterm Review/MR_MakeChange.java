//09.20.15

import java.util.Scanner;

public class MR_MakeChange
{
    public static void main(String[] args)
    {
        System.out.println("Enter a certain amount of money and");
        System.out.print("      I will give you change in coins: $");
        
        Scanner kb = new Scanner(System.in);
        double money = kb.nextDouble();
        makeChange(money);

    }
    public static double makeChange(double money)
    {
        int dollars = (int)money;
        money-=dollars;
        int quarters=(int)(money/0.25);
        money-=quarters*0.25;
        int dimes = (int)(money/0.10);
        money-=dimes*0.10;
        int nickels = (int)(money/0.05);
        money-=nickels*0.05;
        int pennies = (int)(money/0.01);
        
        System.out.println(dollars + "dollars");
        System.out.println(quarters + "quarters");
        System.out.println(dimes + "dimes");
        System.out.println(nickels + "nickels");
        System.out.println(pennies + "pennies");
        
        return money;
    }
}