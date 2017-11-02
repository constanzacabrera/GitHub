/*
 * Constanza Cabrera
 * 10.27.15
    __________________________________________________________
   |                                                          |
   |   EmployeeClass                                          |
   |__________________________________________________________|
   |                                                          |
   | - name: String                                           |
   | - idNumber: int                                          |
   | - department: String                                     |
   | - position: String                                       |
   |__________________________________________________________|
   |                                                          |
   | + Employee(userInputName: String,                        |
   |            userInputIDNumber: int,                       |
   |            userInputDepartment: String,                  |
   |            userInputPosition: String) :                  |
   | + setName(userInputName : String) : void                 |
   | + setIDNumber(userInputIDNumber : int) : void            |
   | + setDepartment(userInputDepartment : String) : void     |
   | + setPosition(userInputPosition : String) : void         |
   | + getName() : String                                     |
   | + getIDNumber() : int                                    |
   | + getDepartment() : String                               |
   | + getPosition() : String                                 |
   |__________________________________________________________|

*/

import java.util.Scanner;
public class EmployeeClass
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);

        String userInputName = "a";
        int userInputIDNumber = 1;
        String userInputDepartment = "b";
        String userInputPosition = "c" ;

        Employee table = new Employee(userInputName, userInputIDNumber,
                userInputDepartment, userInputPosition);

        System.out.print("Please input first and last name: ");
        userInputName = kb.nextLine();
        table.setName(userInputName);

        System.out.print("Please input five digit ID number: ");
        userInputIDNumber = kb.nextInt();
        table.setIDNumber(userInputIDNumber);

        System.out.print("Please input department: ");
        userInputDepartment = kb.next();
        table.setDepartment(userInputDepartment);

        System.out.print("Please input position: ");
        userInputPosition = kb.next();
        table.setPosition(userInputPosition);

        System.out.println("");

        //The following information is for the user input employee...

        System.out.println("Name"+"\t\t"+"ID Number"+"\t"+
            "Department"+"\t"+"Position");
        System.out.println("----"+"\t\t"+"---------"+"\t"+
            "----------"+"\t"+"--------");

        System.out.println(table.getName(userInputName)+
            "\t"+
            table.getIDNumber(userInputIDNumber)+
            "\t\t"+
            table.getDepartment(userInputDepartment)+
            "\t"+
            table.getPosition(userInputPosition)+
            "\t\t <---- This is your employee input information.");

        //The following is for the preset employees...
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("The following information is for the present employees: ");
        
        System.out.println("");
        
        System.out.println("Name"+"\t\t"+"ID Number"+"\t"+
            "Department"+"\t"+"Position");
        System.out.println("----"+"\t\t"+"---------"+"\t"+
            "----------"+"\t"+"--------");
        
        
        Employee SusanMeyers = new Employee(userInputName, userInputIDNumber,
                userInputDepartment, userInputPosition);

        userInputName="Susan Meyers";
        userInputIDNumber=47899;
        userInputDepartment="Acounting";
        userInputPosition = "Vice President";

        System.out.println(SusanMeyers.getName(userInputName)+
            "\t"+
            SusanMeyers.getIDNumber(userInputIDNumber)+
            "\t\t"+
            SusanMeyers.getDepartment(userInputDepartment)+
            "\t"+
            SusanMeyers.getPosition(userInputPosition));

        Employee MarkJones = new Employee(userInputName, userInputIDNumber,
                userInputDepartment, userInputPosition);

        userInputName="Mark Jones";
        userInputIDNumber=39119;
        userInputDepartment="IT";
        userInputPosition = "Programmer";

        System.out.println(MarkJones.getName(userInputName)+
            "\t"+
            MarkJones.getIDNumber(userInputIDNumber)+
            "\t\t"+
            MarkJones.getDepartment(userInputDepartment)+
            "\t\t"+
            MarkJones.getPosition(userInputPosition));

        Employee JoyRogers = new Employee(userInputName, userInputIDNumber,
                userInputDepartment, userInputPosition);

        userInputName="Joy Rogers";
        userInputIDNumber=81774;
        userInputDepartment="Manufacturing";
        userInputPosition = "Engineer";

        System.out.println(JoyRogers.getName(userInputName)+
            "\t"+
            JoyRogers.getIDNumber(userInputIDNumber)+
            "\t\t"+
            JoyRogers.getDepartment(userInputDepartment)+
            "\t"+
            JoyRogers.getPosition(userInputPosition));

    }
}