//09.20.15

import java.util.Scanner;

public class DollarsForChange
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System. in);

        double userInputMoney;

        System.out.println("Enter a certain amount of money and");
        System.out.print("      I will give you change in coins: $");
        userInputMoney = keyboard.nextDouble();

        int programOutputDollars = (int)userInputMoney;
        System.out.println(programOutputDollars + " dollars");

        userInputMoney = userInputMoney - programOutputDollars;
        userInputMoney = userInputMoney*100;

        int programOutputQuarters = (int)userInputMoney/25;
        System.out.println(programOutputQuarters + " quarters");

        userInputMoney = userInputMoney - programOutputQuarters*25;

        int programOutputDimes = (int)userInputMoney/10;
        System.out.println(programOutputDimes + " dimes");

        userInputMoney = userInputMoney - programOutputDimes*10;

        int programOutputNickels = (int)userInputMoney/5;
        System.out.println(programOutputNickels + " nickels");

        userInputMoney = userInputMoney - programOutputNickels*5;

        int programOutputPennies = (int)userInputMoney/1;
        System.out.println(programOutputPennies + " pennies");

    }
}