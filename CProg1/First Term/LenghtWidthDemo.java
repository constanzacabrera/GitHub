//cabrera, constanza
//10.22.15

public class LenghtWidthDemo
{
    private double length;
    private double width;
    
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle();
        
        box.setLength(10.0);
        
        box.setWidth(20.0);
        
        System.out.println("The box's length is " + box.getLength());
        System.out.println("The box's width is " + box.getWidth());
        System.out.println("The box's area is " + box.getArea());
    }
}