//Constanza Cabrera
//9.15.15

import java.util.Scanner;

public class CircuitBoardProfit
{
    public static void main(String[] args)
    {
        String name;
        double percentProfit;
        percentProfit = 0.4;
        double retailPrice;
        double profit;
        
        Scanner Keyboard = new Scanner(System. in);
        
        System.out.println("Enter retail price in $");
        retailPrice = Keyboard.nextDouble();
        
        profit = retailPrice * percentProfit;
        
        System.out.println("Your profit is $" + profit);
        
    }
}
        
