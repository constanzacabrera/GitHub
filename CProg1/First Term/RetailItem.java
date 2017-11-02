//11.1.15

import java.util.Scanner;
public class RetailItem
{
    public static void main(String[] args)
    {
        String a = "a";
        int b = 0;
        double c = 0.0;
        
        RetailItemClass userInput = new RetailItemClass(a, b, c);

        userInput.setDescription("sample");
        userInput.setUnitsOnHand(0);
        userInput.setPrice(0.00);

        System.out.println("Description" + "\t\t" + "Units on Hand" + "\t\t" +
            "Price");
        System.out.println("-----------" + "\t\t" + "-------------" + "\t\t" +
            "-----");
        System.out.println(userInput.getDescription() + "\t\t\t" + userInput.getUnitsOnHand() + 
            "\t\t\t" + userInput.getPrice());
        System.out.println("");
        System.out.println("");
        System.out.println("This is your information^");
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("\t\t" + "Description" + "\t\t" + "Units on Hand" +
                            "\t\t" + "Price");
        System.out.println("\t\t" + "-----------" + "\t\t" + "-------------" +
        "\t\t" + "-----");
        
        RetailItemClass item1 = new RetailItemClass("Jacket", 12, 59.95);
        
        System.out.println("Item # 1" + "\t" + item1.getDescription() + 
        "\t\t\t" + item1.getUnitsOnHand() +  "\t\t\t" + item1.getPrice());
        
        RetailItemClass item2 = new RetailItemClass("Designer Jeans", 40, 34.95);
        
        System.out.println("Item # 1" + "\t" + item2.getDescription() + 
        "\t\t" + item2.getUnitsOnHand() +  "\t\t\t" + item2.getPrice());
        
        RetailItemClass item3 = new RetailItemClass("Shirt", 20, 24.95);
        
        System.out.println("Item # 1" + "\t" + item3.getDescription() + 
        "\t\t\t" + item3.getUnitsOnHand() +  "\t\t\t" + item3.getPrice());
        
    }
}