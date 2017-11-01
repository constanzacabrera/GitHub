import java.applet.Applet; 
import java.awt.*; 
 
 
public class numberFieldTest extends Applet 
{ 
    private NumberField input1 = new NumberField(); 
    private NumberField input2 = new NumberField(1.0); 
    private TextField output1 = new TextField(); 
    private TextField output2 = new TextField(); 
    private Button enter = new Button("Click Here"); 
     
    public void init() 
    { 
        setLayout(new GridLayout(3,3)); 
        add(input1); 
        add(new Label(" = integer ")); 
        add(output1); 
         
        add(input2); 
        add(new Label(" = double ")); 
        add(output2); 
         
        add(new Label(" NumberField ")); 
        add(enter); 
        add(new Label("TextField")); 
    } 
     
    public boolean action (Event e, Object o) 
    { 
        if (e.target == enter) 
        { 
            output1.setText(String.valueOf(input1.getInteger())); 
            output2.setText(String.valueOf(input2.getDouble())); 
            return true; 
        } 
        else 
            return false; 
    } 
} 