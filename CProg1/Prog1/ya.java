
public static void isValid(int number)
{
    boolean status; 
    if (number>-1 && number <= 100)
        status = true;
    else 
        status = false;
        
// also written as return(number>=&&number<=100);
}
{
int value = 20;
if (isValid(value)) //aslo written as if (isValid(value)==true) 
    System.out.println("The value is within range.");
else 
    System.out.println("The value is out of range"); 
}

public static String fullName(String first, String last)
{
    String name;
    name = first + " " + last;
    return name;
}