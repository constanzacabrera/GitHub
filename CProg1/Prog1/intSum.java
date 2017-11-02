public static int um (int num1, int num2)
{
    int result;
    result = num1+num2;
    return result;
}

public static boolean isValid(int number)
{
    boolean status; 
    if (number>-1 && number <= 100)
        status = true;
    else 
        status = false;
}

int value = 20;
if (isValid(value))
    System.out.println("The value is within range.");
else 
    System.out.println("The value is out of range"); 