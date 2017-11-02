//Constanza Cabrera
//10.27.15

/*
    ____________________________________________
   |                                            |
   |   CircleClass                              |
   |____________________________________________|
   |                                            |
   | - PI: double                               |
   | - radius: double                           |
   |____________________________________________|
   |                                            |
   | + Circle() :                  		        |
   | + circle(r : double) : void               	|
   | + setRadius(r : double) : void            	|
   | + getRadius() : double     		        |
   | + getArea() : double                       |
   | + getDiameter() : double                   |
   | + getCircumference() : double              |
   |____________________________________________|

*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Circle {
    private final double PI = 3.14159;
    private double radius;

    public Circle() 
    {
        radius = 0.0;
    }

    public void Circle(double r) 
    {
        radius = r;
    }

    public void setRadius(double r) 
    {
        radius = r;
    }

    public double getRadius() 
    {
        return radius;
    }

    public double getArea() 
    {
        return (double)(PI * radius * radius);
    }

    public double getDiameter() 
    {
        return (double)(radius * 2);
    }

    public double getCircumference() 
    {
        return (double)(2 * PI * radius);
    }

    public static void main(String[] args) 
    {
        DecimalFormat df = new DecimalFormat("##.####");
        Circle circle = new Circle();
        System.out.println("Radius" + "\t\t" + "Diameter" + "\t" + 
                         "Perimeter" + "\t" + "Area");
        circle.setRadius(0);
        System.out.println(circle.getRadius() + "\t\t" + 
                            circle.getDiameter() + "\t\t" +
                            df.format(circle.getCircumference()) + "\t\t" +
                            df.format(circle.getArea()));
        circle.setRadius(.5);
        System.out.println(circle.getRadius() + "\t\t" + 
                            circle.getDiameter() + "\t\t" +
                            df.format(circle.getCircumference()) + "\t\t" +
                            df.format(circle.getArea()));
        circle.setRadius(1);
        System.out.println(circle.getRadius() + "\t\t" + 
                            circle.getDiameter() + "\t\t" +
                            df.format(circle.getCircumference()) + "\t\t" +
                            df.format(circle.getArea()));
        circle.setRadius(1.5);
        System.out.println(circle.getRadius() + "\t\t" + 
                            circle.getDiameter() + "\t\t" +
                            df.format(circle.getCircumference()) + "\t\t" +
                            df.format(circle.getArea()));
        circle.setRadius(2);
        System.out.println(circle.getRadius() + "\t\t" + 
                            circle.getDiameter() + "\t\t" +
                            df.format(circle.getCircumference()) + "\t\t" +
                            df.format(circle.getArea()));
    }
}