//Constanza Cabrera
//11.5.2015

/*  ________________________________________
 * |                                        |
 * | ChargeAccount                          |
 * |________________________________________|
 * |                                        |
 * | +validAccountNumbers:int[]             |
 * |________________________________________|
 * |                                        |
 * | +isValid(userInput:int):boolean        |
 * | +isValidE(validation:boolean):String   |
 * | +getTableValidAccountNumbers():void    |
 * |________________________________________|
 */

import java.util.Scanner;
public class ChargeAccount
{
    int[] validAccountNumbers={11111, 22222, 33333, 44444, 55555, 66666, 77777, 
            88888, 99999, 10101, 20202, 30303, 40404, 50505, 60606, 70707, 80808, 90909};
    public static void main(String[] args)
    {
        ChargeAccount execute = new ChargeAccount();
        Scanner kb = new Scanner(System.in);
        System.out.println("Please input a charge account number.");
        System.out.println("");
        System.out.println("I will tell you if it is a valid account number.");
        int userInput = kb.nextInt();
        boolean validation = execute.isValid(userInput);
        String eValidation = execute.isValidE(validation);
        System.out.println("");
        System.out.println(eValidation);
    }

    public boolean isValid(int userInput)
    {
        boolean validation=false;
        for (int i=0; i<validAccountNumbers.length; i++)
            if (validAccountNumbers[i]==userInput)
            {
                validation = true;
                return validation;
            }
        return validation;
    }

    public String isValidE(boolean validation)
    {
        String eValidation;
        if (validation==true)
            eValidation="This is a valid account number.";
        else 
            eValidation="This is not a valid account number.";
        return eValidation;
    }

    public void getTableValidAccountNumbers()
    {
        for (int i=0; i<validAccountNumbers.length; i++)
            System.out.println(validAccountNumbers[i]);
    }
}