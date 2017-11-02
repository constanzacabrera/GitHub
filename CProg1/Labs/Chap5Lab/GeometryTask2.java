//Constanza Cabrera
//10.13.15

import java.util.Scanner;
import java.lang.Math;

/**
This program demonstrates static methods
 */
public class GeometryTask2
{
    public static double printMenu(int choice)
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("This is a geometry calculator ");
        System.out.println("Choose what you would like to calculate ");
        System.out.println("1.  Find the area of a circle");
        System.out.println("2.  Find the area of a rectangle ");
        System.out.println("3.  Find the area of a triangle");
        System.out.println("4.  Find the circumference of a circle");
        System.out.println("5.  Find the perimeter of a rectangle ");
        System.out.println("6.  Find the perimeter of a triangle ");
        System.out.println("Enter the number of your choice: ");

        return(choice);
    }
    public static double circleArea(double radius)
    {
        double value;
        value = Math.PI*(radius*radius);
        return value;
    }
    public static double rectangleArea(double length, double width)
    {
        double value;
        value = length*width;
        return value;
    }
    public static double triangleArea(double base, double height)
    {
        double value;
        value = base*height*0.5;
        return value;
    }
    public static double circleCircumference(double radius)
    {
        double value;
        value = radius*2*Math.PI;
        return value;
    }
    public static double rectanglePerimeter(double length, double width)
    {
        double value;
        value = 2*(length+width);
        return value;
    }
    public static double trianglePerimeter(double side1, double side2, double side3)
    {
        double value;
        value = side1+side2+side3;
        return value;
    }
    public static void main (String [] args)
    {
        int choice=0;       //the user's choice
        double value = 0;   //the value returned from the method
        char letter;        //the Y or N from the user's decision to exit
        double radius;      //the radius of the circle
        double length;      //the length of the rectangle
        double width;       //the width of the rectangle
        double height;      //the height of the triangle
        double base;        //the base of the triangle
        double side1;       //the first side of the triangle
        double side2;       //the second side of the triangle
        double side3;       //the third side of the triangle

        //create a scanner object to read from the keyboard
        Scanner keyboard = new Scanner (System.in);

        //do loop was chose to allow the menu to be displayed first
        do
        {
            printMenu(choice);
            choice = keyboard.nextInt();

            if (choice == 1)
            {
                System.out.print("Enter the radius of the circle:  ");
                radius = keyboard.nextDouble();
                value = circleArea(radius);
                
                System.out.println("The area of the circle is " + value);
            }
            else if (choice == 2)
            {
                System.out.print("Enter the length of the rectangle:  ");
                length = keyboard.nextDouble();
                System.out.print("Enter the width of the rectangle:  ");
                width = keyboard.nextDouble();
                value = rectangleArea(length, width);

                System.out.println("The area of the rectangle is " + value);
            }
            else if (choice == 3)
            {
                System.out.print("Enter the height of the triangle:  ");
                height = keyboard.nextDouble();
                System.out.print("Enter the base of the triangle:  ");
                base = keyboard.nextDouble();
                value = triangleArea(base, height);

                System.out.println("The area of the triangle is " + value);
            }
            else if (choice == 4)
            {
                System.out.print("Enter the radius of the circle:  ");
                radius = keyboard.nextDouble();
                value = circleCircumference(radius);

                System.out.println("The circumference of the circle is " + value);
            }
            else if (choice == 5)
            {
                System.out.print("Enter the length of the rectangle:  ");
                length = keyboard.nextDouble();
                System.out.print("Enter the width of the rectangle:  ");
                width = keyboard.nextDouble();
                value = rectanglePerimeter(length, width);

                System.out.println("The perimeter of the rectangle is " + value);
            }
            else if (choice == 6)
            {
                System.out.print("Enter the length of side 1 of the triangle:  ");
                side1 = keyboard.nextDouble();
                System.out.print("Enter the length of side 2 of the triangle:  ");
                side2 = keyboard.nextDouble();
                System.out.print("Enter the length of side 3 of the triangle:  ");
                side3 = keyboard.nextDouble();
                value = trianglePerimeter(side1, side2, side3);

                System.out.println("The perimeter of the triangle is " + value);
            }
            else
                System.out.println("You did not enter a valid choice.");

            keyboard.nextLine(); //consumes the new line character after the number                     
            System.out.println("Do you want to exit the program (Y/N)?:  ");
            String answer = keyboard.nextLine();
            letter = answer.charAt(0);
        }while (letter != 'Y' && letter != 'y');
    }
}