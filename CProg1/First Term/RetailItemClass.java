//11.1.15

/*
____________________________________________
|                                            |
|   RetailItemClass                          |
|____________________________________________|
|                                            |
| - description: String                      |
| - unitsOnHand: int                         |
| - price: double                            |
|____________________________________________|
|                                            |
| + RetailItemClass(describe : String,       |
|        units : int, retailPrice : double) :|
| + setDescription(describe : String) : void |
| + setUnitsOnHand(units : int) : void       |
| + setPrice(retailPrice : double) : void    |
| + getDescription() : String                |
| + getUnitsOnHand() : int                   |
| + getPrice() : int                         |
|____________________________________________|

 */

import java.util.Scanner;

public class RetailItemClass
{
    private String description;
    private int unitsOnHand;
    private double price;

    public RetailItemClass(String describe, int units, double retailPrice)
    {
        description = describe;
        unitsOnHand = units;
        price = retailPrice;
    }

    public void setDescription(String describe)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please give me a description of the item: ");
        description= kb.nextLine(); 
        describe = description;
    }

    public void setUnitsOnHand(int units)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please give me the number of units on hand: ");
        units = kb.nextInt();
        unitsOnHand = units;
    }

    public void setPrice(double retailPrice)
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Please give me the item’s retail price: $");
        retailPrice = kb.nextDouble();
        price = retailPrice;
    }

    public String getDescription()
    {
        return description;
    }

    public int getUnitsOnHand()
    {
        return unitsOnHand ;
    }

    public double getPrice()
    {
        return price;
    }

}
