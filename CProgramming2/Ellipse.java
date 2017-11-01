public class Ellipse extends Shape 
{  // fields 
    double a, b; 
    // constructors
    public Ellipse()
    {
        name = "Ellipse";
        a = b = 0;
    }

    public Ellipse(double _a, double _b) 
    { 
        name = "Ellipse"; 
        a = _a;
        b = _b;
    } 
    // methods 
    public void computeArea() 
    { 
        area = Math.PI * a * b; 
    } 

    public void computePerimeter() 
    { 
        perimeter = 2 * Math.PI * Math.sqrt(((a*a)+(b*b))/2); 
    }
}
