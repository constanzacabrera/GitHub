//Constanza Cabrera
//09.20.15

import java.util.Scanner;
import java.text.DecimalFormat;
public class ShippingCharges
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System. in);
        
        System.out.println("This program will display");
        System.out.println("shipping charges on a given package");
        System.out.println("using Fast Freight Shipping Company.");
        System.out.println("Please enter the weight of your package.");
       
        double weightOfPackage = keyboard.nextDouble();
        
        DecimalFormat formatter = new DecimalFormat("#0.00");
        
        if (weightOfPackage<=2.0)
            {
            System.out.print("$" + formatter.format(1.10 * weightOfPackage) 
                             + " will be your charge.");
            }                
        else if ((weightOfPackage>2.0)&&(weightOfPackage<=6.0))
            {
            System.out.print("$" + formatter.format(2.20 * weightOfPackage) 
                             + " will be your charge.");
            }                
        else if ((weightOfPackage>6.0)&&(weightOfPackage<=10.0))
            {    
            System.out.print("$" + formatter.format(3.70 * weightOfPackage) 
                             + " will be your charge.");
            }                 
        else if (weightOfPackage>10.0)
            {
            System.out.print("$" + formatter.format(3.80 * weightOfPackage) 
                             + " will be your charge.");
            }
    }
}
        