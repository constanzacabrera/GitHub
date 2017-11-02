import java.util.Scanner;

public class daysSales
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System. in);
            {
                int days;          //The number of days
                double sales;      //A day's sales figure
                double totalSales; //Accummulator
         
                System.out.println("For how many days? "); //get the number of days
                days = keyboard.nextInt();
         
                totalSales = 0.0;
                for (int count = 1; count <= days; count++)
                    {
                    System.out.println("Enter the sales for day " + count + ": ");
                    sales = keyboard.nextDouble();
                    totalSales += sales;           //Add sales to totalSales
                    }
                //Display the total sales.
                System.out.println("The total sales are $" + totalSales);
            }
    }
}