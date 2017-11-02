//  One acre of land is equivalent to 43,560 square feet. 
//  Write a program that calculates and prints the number 
//  of acres in a plot of land with 389,767 square feet. 
//  Hint: Divide the size of the plot of land by the size 
//  of an acre to net the number of acres. Declare variable 
//  squareFeetPerAcre=43560 and squareFeet =389767.
//  Use variable acres to hold the result.

//09/10/2015

public class LandCalculation
{
    public static void main(String[] args)
    {
        double squareFeetPerAcre, squareFeet, acres;
        
        squareFeetPerAcre = 43560;
        squareFeet = 389767;
        acres = squareFeet / squareFeetPerAcre;
        
        System.out.println("The number of acres in a plot of land containing");
        System.out.println(squareFeet + " sq ft ");
        System.out.println("is equal to");
        System.out.println(acres);      
        
    }
}