public class Shape
{ // fields 
    String name; 
    double area, perimeter; 
    // constructor 
    public Shape() 
    { 
        name = "Undetermined Shape"; 
        area = perimeter = 0; 
    } 
    // methods 
    public void display() 
    { 
        System.out.println("Name: " + name); 
        System.out.println("Area: " + area); 
        System.out.println("Perimeter: " + perimeter); 
    } 
}