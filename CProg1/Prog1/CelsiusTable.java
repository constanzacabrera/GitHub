//10.12.15
import java.util.Scanner;
import java.lang.Math;

public class CelsiusTable {
    public static double celsius(double fahrenheit) 
    {
        double celsius;
        double constant = 5.0/9.0;
        celsius = constant * (fahrenheit - 32);
        celsius = Math.round(celsius*10)/10;
        System.out.println("The degrees Celsius is equal to " + celsius);
        
        System.out.println(" ");

        System.out.println("Fahrenheit        Celsius");
        System.out.println("-------------------------");
        for (fahrenheit=32; fahrenheit<213.0; fahrenheit+=20)
        {
            celsius = constant * (fahrenheit - 32);
            celsius = Math.round(celsius*10)/10;
            System.out.println(fahrenheit + "\t\t" + celsius);
        }
        return (celsius);
    }
    public static void main()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter degrees in Fahrenheit: ");
        double fahrenheit = keyboard.nextDouble();
        System.out.println(" ");
        System.out.println("Calculating degrees in Celsius........");
        System.out.println(" ");

        celsius(fahrenheit);
    }
}