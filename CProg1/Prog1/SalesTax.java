//Constanza Cabrera
//Computer Programming 
//09.15.15

import java.util.Scanner;

public class SalesTax
{
    public static void main(String[] args)
    {
        String sale;
        double purchase;
        double stateTax;
        stateTax = 0.04;
        double countyTax;
        countyTax = 0.02;
        double totalTax;
        double totalSale;
       
        Scanner keyboard = new Scanner(System. in);
        
        System.out.print("Enter amount of purchase $: ");
        purchase = keyboard.nextInt();
        
        System.out.println("Amount of purchase is $" + purchase);
        
        stateTax = purchase * stateTax;       
        System.out.println("Amount of state tax is $" + stateTax);
       
        countyTax = purchase * countyTax;
        System.out.println("Amount of county tax is $" + countyTax);
        
        totalTax = stateTax + countyTax;
        System.out.println("Amount of total tax is $" + totalTax);
        
        totalSale = purchase + totalTax;
        System.out.println("Amount of total sale is $" + totalSale);
                
    }
}
        
        
        