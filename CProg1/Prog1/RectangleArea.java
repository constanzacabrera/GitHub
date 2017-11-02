//2. Rectangle Area—Complete the Program
//Constanza Cabrera
//10.08.15
import java.util.Scanner;
public class RectangleArea
{
   public static double getLength(double length)
    {
        return length;
    }
   public static double getWidth(double width)
    {
        return width;
    }
   public static double getArea(double length, double width)
    {
        double area=length*width;
        return area;
    }
   public static double displayData(double length, double width, double area)
    {
        System.out.println("The length is " + length);
        System.out.println("The width is " + width);
        System.out.println("The area is " + area);
        return area;
    }
   public static void main(String[] args)

   {
      Scanner kb = new Scanner (System.in);
      double length,    // The rectangle's length
             width,     // The rectangle's width
             area;      // The rectangle's area

      // Get the rectangle's length from the user.
      System.out.println("Please input the length of the rectangle.");
      length=kb.nextDouble();
      length = getLength(length);
      // Get the rectangle's width from the user.
      System.out.println("Please input the width of the rectangle.");
      width=kb.nextDouble();
      width = getWidth(width);
      // Get the rectangle's area.
      area = getArea(length, width);
      // Display the rectangle data.
      displayData(length, width, area);

   }

}