 
import java.awt.*; 
public class NumberField extends TextField 
{   //Fields 
    private double def = 0.0; 
    // Constructors 
    public NumberField() 
    { 
        super(); 
    } 
    public NumberField(double _def) 
    { 
        def = _def; 
    } 
    //public Methods 
    public int getInteger() 
    { 
        try 
        { 
            return Integer.parseInt(getText()); 
        } 
        catch (NumberFormatException e) 
        { 
            return (int)def; 
        } 
    } 
    public double getDouble() 
    { 
        try 
        { 
            return (Double.valueOf(getText())).doubleValue(); 
        } 
        catch (NumberFormatException e) 
        { 
            return def; 
        } 
    } 
} 
 