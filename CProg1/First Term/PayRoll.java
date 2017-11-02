//11.5.2015

/*  ________________________________________
 * |                                        |
 * | PayRoll                                |
 * |________________________________________|
 * |                                        |
 * | +employeeIDs:int[]                     |
 * | +hours:int[]                           |
 * | +payRate:double[]                      |
 * | +wages:double[]                        |
 * |________________________________________|
 * |                                        |
 * | +getEmployeeIDs():void                 |
 * | +getWagesTable():void                  |
 * | +getWages(userInputID:int):void        |
 * |________________________________________|
 */

import java.util.Scanner;
public class PayRoll
{
    int[] employeeIDs = {56588, 45201, 78951, 87775, 84512, 13028, 75804};
    int[] hours = {40, 41, 42, 43, 44, 45, 46};
    double[] payRate = {13.60, 13.50, 13.40, 13.30, 13.20, 13.10, 13.00};
    double[] wages = {544.00, 553.50, 562.80, 572.90, 580.80, 589.50, 598.00};
    public static void main(String[] args)
    {
        PayRoll execute = new PayRoll();
        Scanner kb = new Scanner(System.in);
        System.out.println("The following are the employee ID numbers.");

        execute.getEmployeeIDs();

        System.out.println("");
        System.out.println("Please input an employee ID number.");
        System.out.println("");

        int userInputID = kb.nextInt();

        System.out.println("");

        execute.getWages(userInputID);

        System.out.println("");
        System.out.println("");
        execute.getWagesTable();
    }

    public void getEmployeeIDs()
    {
        for (int i=0; i<employeeIDs.length; i++)
            System.out.println(employeeIDs[i]);
    }

    public void getWagesTable()
    {
        System.out.println("EmployeeID"+"\t"+"Hours"+"\t"+"PayRate"+"\t"+"Wages");
        for (int i=0; i<employeeIDs.length; i++)
            System.out.println(employeeIDs[i] + "\t\t" + hours[i]+"\t" +(double)(payRate[i])+"\t"+(double)(wages[i]));
    }

    public void getWages(int userInputID)
    {
        for (int i=0; i<employeeIDs.length; i++)
            if (employeeIDs[i]==userInputID)
            {
                System.out.println("EmployeeID"+"\t"+"Hours"+"\t"+"PayRate"+"\t"+"Wages");
                System.out.println(employeeIDs[i]+"\t\t"+hours[i]+"\t"+(double)(payRate[i])+"\t"+(double)(wages[i]));
            }
    }
}