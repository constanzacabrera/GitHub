//Constanza Cabrera
//09.17.15
//Prog 3_1

import java.util.Scanner;

public class RomanNumeralConverter
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System. in);
        
        int number_RomanNumeral;
        
        System.out.println("Input a number 1 - 10.");
        number_RomanNumeral = keyboard.nextInt();
        
        if (number_RomanNumeral == 1)
            System.out.print("This number is equivalent to I in Roman Numerals.");
        else if (number_RomanNumeral == 2)
            System.out.print("This number is equivalent to II in Roman Numerals.");
        else if (number_RomanNumeral == 3)
            System.out.print("This number is equivalent to III in Roman Numerals.");
        else if (number_RomanNumeral == 4)
            System.out.print("YThis number is equivalent to IV in Roman Numerals.");
        else if (number_RomanNumeral == 5)
            System.out.print("This number is equivalent to V in Roman Numerals.");
        else if (number_RomanNumeral == 6)
            System.out.print("This number is equivalent to VI in Roman Numerals.");
        else if (number_RomanNumeral == 7)
            System.out.print("This number is equivalent to VII in Roman Numerals.");
        else if (number_RomanNumeral == 8)
            System.out.print("This number is equivalent to VIII in Roman Numerals.");
        else if (number_RomanNumeral == 9)
            System.out.print("This number is equivalent to IX in Roman Numerals.");
        else if (number_RomanNumeral == 10)
            System.out.print("This number is equivalent to X in Roman Numerals.");
        else 
            System.out.print("Invalid input.");
        
    } 
}