//Constanza Cabrera
//11.3.15

/*
    _________________________________________________
   |                                                 |
   |   SavingsAccountClass                           |
   |_________________________________________________|
   |                                                 |
   | - startingBalance: double                       |
   | - annualInterestRate: double                    |
   | - withdraw: double                              |
   | - deposit: double                               |
   |_________________________________________________|
   |                                                 |
   | + SavingsAccountClass(initial:double, 	     |
   |		annualInterest:double, 		     |
   |		deposited:double,		     |
   |		withdraw:double) :                   |
   | + setWithdrawalAmount(withdrawal:double):void   |
   | + setDepositAmount(deposited:double):void       |
   | + getInitialAmount() : double     		     |
   | + getAnnualInterestRate() : double              |
   | + getWithdrawalAmount() : double                |
   | + getDepositAmount() : double                   |
   | + getInterestEarned() : double                  |
   | + getMonthlyAmount() : double                   |
   |_________________________________________________|

*/

import java.util.Scanner;
public class SavingsAccountClass
{   
    Scanner kb = new Scanner(System.in);
    private double startingBalance;
    private double annualInterestRate;
    private double withdraw;
    private double deposit;

    public SavingsAccountClass(double initial, double annualInterest,
    double withdrawal, double deposited)
    {
        startingBalance = initial;
        annualInterestRate = annualInterest;
        withdraw = withdrawal;
        deposit = deposited;
    }
    
    public void setWithdrawalAmount(double withdrawal)
    {
        System.out.print("Please enter withdrawal amount: $");
        withdraw = kb.nextDouble();
        withdrawal = withdraw;
    }

    public void setDepositAmount(double deposited)
    {
        System.out.print("Please enter deposit amount: $");
        deposit = kb.nextDouble();
        deposited = deposit;
    }

    public double getInitialAmount()
    {
        return startingBalance;
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public double getWithdrawalAmount()
    {
        return withdraw;
    }

    public double getDepositAmount()
    {
        return deposit;
    }

    public double getInterestEarned()
    {
        double monthlyInterest = ((annualInterestRate/12)*startingBalance);
        return monthlyInterest;
    }

    public double getMonthlyAmount()
    {
        double finalBalance = startingBalance + deposit - withdraw;
        finalBalance += ((annualInterestRate/12)*startingBalance);
        return finalBalance;
    }

}
