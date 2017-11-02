
/**
 * Write a description of class sdgs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayGenerator
{
    
    public static void main(String[] args)
    {
        
        for (int i=1; i<76; i++)
            String[i] = i;
    }
    
    public void shuffle(String[] list, int x, int y)
    {
        int temp=list[x];
        list[x]=list[y];
        list[y]=temp;
    }
}
