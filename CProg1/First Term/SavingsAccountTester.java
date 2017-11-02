//Constanza Cabrera
//11.3.15

public class SavingsAccountTester
{public static void main(String[] args)
    {
        double startingBalance;
        double annualInterestRate;
        double withdraw;
        double deposit;
        
        System.out.println("Starting     Annual                             "+
                           "              Interest     Ending");
        System.out.println("Balance    int. rate     Months     Deposits    "+
                            "Withdrawals    earned      balance");  
        System.out.println("------------------------------------------------"+
                           "----------------------------------");
        
        SavingsAccountClass testCase1 = new SavingsAccountClass(500, 0.0, 50, 100);
        System.out.println(testCase1.getInitialAmount()+"         "+
                           testCase1.getAnnualInterestRate()+"           "+
                           "1"+"         "+
                           testCase1.getDepositAmount()+"         "+
                           testCase1.getWithdrawalAmount()+"         "+
                           testCase1.getInterestEarned()+"        "+
                           testCase1.getMonthlyAmount());
                           
        SavingsAccountClass testCase2 = new SavingsAccountClass(500, 0.12, 50, 100);
        
        System.out.println(testCase1.getInitialAmount()+"         "+
                           testCase2.getAnnualInterestRate()+"          "+
                           "1"+"         "+
                           testCase2.getDepositAmount()+"         "+
                           testCase2.getWithdrawalAmount()+"         "+
                           testCase2.getInterestEarned()+"        "+
                           testCase2.getMonthlyAmount());
                           
        SavingsAccountClass testCase3 = new SavingsAccountClass(500, 0.24, 50, 100);
        System.out.println(testCase3.getInitialAmount()+"         "+
                           testCase3.getAnnualInterestRate()+"          "+
                           "1"+"         "+
                           testCase3.getDepositAmount()+"         "+
                           testCase3.getWithdrawalAmount()+"         "+
                           testCase3.getInterestEarned()+"       "+
                           testCase3.getMonthlyAmount());
    
    }
}