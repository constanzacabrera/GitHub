public class ShapeTester 
{ 
   public static void main(String args[]) 
   { 
      Shape s = new Shape(); 
      Rectangle r = new Rectangle(2.0, 3.0); 
      Circle c = new Circle(4.0);  
      Parallelogram p = new Parallelogram(4.0, 5.0, 6.0);  
      Ellipse e = new Ellipse(4.0, 5.0);   
      Square q = new Square(4.0);   
      
      r.computeArea(); 
      r.computePerimeter();      
      c.computeArea(); 
      c.computePerimeter();
      p.computeArea(); 
      p.computePerimeter();      
      e.computeArea(); 
      e.computePerimeter();      
      q.computeArea(); 
      q.computePerimeter();
      
      r.display(); 
      c.display(); 
      p.display(); 
      e.display(); 
      q.display();
      s.display(); 
   } 
}