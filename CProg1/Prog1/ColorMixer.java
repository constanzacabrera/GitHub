//Constanza Cabrera
//09.20.15
//Prog 3_1

import java.util.Scanner;

public class ColorMixer
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System. in);
        
        String colorOne;
        String colorTwo;
                
        System.out.print("Please enter one of the three primary colors to mix: ");
        colorOne = keyboard.nextLine();
        
        System.out.println("Please enter one of the three primary"); 
        System.out.print("      colors to mix with the first color you input: ");
        colorTwo = keyboard.nextLine(); 
        
        if ( (colorOne.equalsIgnoreCase("red")) && (colorTwo.equalsIgnoreCase("blue")) )
        {
            System.out.print("When you mix " + colorOne + " and " + colorTwo + ", you get purple.");
        }
        else if ( (colorOne.equalsIgnoreCase("blue")) && (colorTwo.equalsIgnoreCase("red")) )
        {
            System.out.print("When you mix " + colorOne + " and " + colorTwo + ", you get purple.");
        }
        else if ( (colorOne.equalsIgnoreCase("red")) && (colorTwo.equalsIgnoreCase("yellow")) )
        {
            System.out.print("When you mix " + colorOne + " and " + colorTwo + ", you get orange.");
        }
        else if ( (colorOne.equalsIgnoreCase("yellow")) && (colorTwo.equalsIgnoreCase("red")) )
        {
            System.out.print("When you mix " + colorOne + " and " + colorTwo + ", you get orange.");
        }
        else if ( (colorOne.equalsIgnoreCase("blue")) && (colorTwo.equalsIgnoreCase("yellow")) )
        {
            System.out.print("When you mix " + colorOne + " and " + colorTwo + ", you get green.");
        }
        else if ( (colorOne.equalsIgnoreCase("yellow")) && (colorTwo.equalsIgnoreCase("blue")) )
        {
            System.out.print("When you mix " + colorOne + " and " + colorTwo + ", you get green.");
        }
        else 
        {
            System.out.print("I don't know what you get when mixing " + colorOne + " and " + colorTwo + ".");
        }
    }
}
           