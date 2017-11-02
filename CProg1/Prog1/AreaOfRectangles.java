//09.20.15
//Prog 3_1

import java.util.Scanner;

public class AreaOfRectangles
{
    public static void main(String[] args)
    {
        String testaverage;
        double rectangle_1_Length;
        double rectangle_2_Length;
        double rectangle_1_Width;
        double rectangle_2_Width;
       
        Scanner keyboard = new Scanner(System. in);
        
        System.out.print("Please input the length for the first rectangle: ");
        rectangle_1_Length = keyboard.nextDouble();
        
        System.out.print("Please input the width for the first rectangle: ");
        rectangle_1_Width = keyboard.nextDouble();
        
        System.out.print("Please input the length for the second rectangle: ");
        rectangle_2_Length = keyboard.nextDouble();
        
        System.out.print("Please input the width for the second rectangle: ");
        rectangle_2_Width = keyboard.nextDouble();
        
        double rectangle_1_Area;
            rectangle_1_Area = rectangle_1_Length * rectangle_1_Width;
        double rectangle_2_Area;
            rectangle_2_Area = rectangle_2_Length * rectangle_2_Width;
        
        
        if (rectangle_1_Area > rectangle_2_Area)
        {
            System.out.println("The first rectangle has a larger area than the second rectangle.");
            System.out.println("While the first rectangle has an area of " + rectangle_1_Area + ", ");
            System.out.println("the second rectangle has an area of " + rectangle_2_Area + ".");
        }    
        else if  (rectangle_1_Area < rectangle_2_Area)
        {    
            System.out.println("The second rectangle has a smaller area than the first rectangle.");
            System.out.println("While the first rectangle has an area of " + rectangle_1_Area + ", ");
            System.out.println("the second rectangle has an area of " + rectangle_2_Area + ".");
        }
        else if (rectangle_1_Area == rectangle_2_Area)
        {
            System.out.println("The first and second rectangle have equivalent areas.");
            System.out.println("Both the first and second rectangles have an area of " + rectangle_1_Area + ".");
        }       
    }
}