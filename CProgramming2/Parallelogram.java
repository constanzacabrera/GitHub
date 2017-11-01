public class Parallelogram extends Shape 
{  // fields 
    double slant, length, height; 
    // constructors
    public Parallelogram()
    {
        name = "Parallelogram";
        slant = length = height = 0;
    }

    public Parallelogram(double _slant, double _length, double _height) 
    { 
        name = "Parallelogram"; 
        slant = _slant; 
        length = _length; 
        height = _height;
    } 
    // methods 
    public void computeArea() 
    { 
        area = length * height; 
    } 

    public void computePerimeter() 
    { 
        perimeter = 2*(length + slant); 
    } 
}