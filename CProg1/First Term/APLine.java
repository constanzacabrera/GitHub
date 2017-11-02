//Constanza Cabrera
//10.27.15

/*
    ______________________________________________________________
   |                                            		          |
   |   APLine                                   		          |
   |______________________________________________________________|
   |                                            		          |
   | - a: int                               			          |
   | - b: int                               			          |
   | - c: int                               			          |
   | - x: int                               			          |
   | - y: int                               			          |
   |______________________________________________________________|
   |                                            		          |
   | + APLine(aValue : int, bValue : int, cValue : int) :  	      |
   | + isOnline(x : in, y : int) : boolean   			          |
   | + getSlope() : double                                        |
   |______________________________________________________________|

*/


public class APLine
{
    private int a;
    private int b;
    private int c;
    private int x;
    private int y;

    public double getSlope()
    {
        double slope = -(double)a/b;
        return slope;
    }

    public boolean isOnLine(int x, int y)
    {
        return a*x+b*y+c==0;
    }

    public APLine(int aValue, int bValue, int cValue)
    {
        a = aValue;
        b = bValue;
        c = cValue;
    } 

    public static void APLine()
    {
        APLine line1 = new APLine(5,4,-17);
        double slope1 = line1.getSlope();
        boolean onLine1 = line1.isOnLine(5,-2);
        System.out.println(slope1);
        System.out.println(onLine1);
        
        System.out.println("");

        APLine line2 = new APLine(-25,40,30);
        double slope2 = line2.getSlope();
        boolean onLine2 = line2.isOnLine(5,-2);
        System.out.println(slope2);
        System.out.println(onLine2);

        return;
    }
}
