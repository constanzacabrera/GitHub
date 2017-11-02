import java.util.Scanner;
import java.text.DecimalFormat;
public class PenniesForPay
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#0.00");

        System.out.print("Hello employee. How many days did you work this month? ");

        double salaryInput = 0.01;
        int dayOfMonth;

        dayOfMonth = keyboard.nextInt();
        int daysEmployeeWorked = dayOfMonth; 

        if (!((dayOfMonth>1)||(dayOfMonth<31)))
        {
            System.out.print("Input invalid, please try again. ");
            dayOfMonth = keyboard.nextInt();
        }
        System.out.println("I will display a table of your");
        System.out.println("salary for each day you've worked ");
        System.out.println("as well as the total pay earned for this month.");

        System.out.println("Salary        # of Day of Month");
        System.out.println("-------------------------------");
        if ((dayOfMonth>=0)&&(dayOfMonth<=31))
        {               
            for (dayOfMonth=1; dayOfMonth<=daysEmployeeWorked; dayOfMonth++)
            {
                System.out.println("$" + formatter.format(salaryInput) + "\t\t" + dayOfMonth);
                salaryInput*=2;
            }
        }

        double addition = salaryInput;
        while (addition<salaryInput)
            addition = salaryInput+(salaryInput*2);

        System.out.println("Your total salary for this month is $" + formatter.format(addition));
    }
}
