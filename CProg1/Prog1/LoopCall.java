public class LoopCall
{
    public static void main(String[] args)
    {
        System.out.println("Hello from the main method.");
        for (int i = 0; i < 5; i++)
            displayMessages();
        System.out.println("Back in the main method");        
    }
    public static void displayMessages()
    {
        System.out.println("Hello from the displayMessage method.");
    }
}

public static void displayValue(int num)
{
    displayValue = (5);
    for (int i=1; i<=5; i++)
        displayValue(i);
        System.out.println("The value is " +  num);
}

showSum(5,10);

public static void showSum(double, num1, double num2)
{
    double sum;
    sum = num1+num2;
    System.out.println("The sum is " + sum);
}

showLength(name);

public static void showLength(String str)
{
    System.out.println (str + " is " + str.length() + " characters long");
    str = "Joe";
}

