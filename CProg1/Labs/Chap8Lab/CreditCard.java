package Chap8Lab;

//Constanza Cabrera
//12.8.15

public class CreditCard
{
    private Money balance;
    private Money creditLimit;
    private Person owner;
    
    public CreditCard(Person newCardHolder, Money limit)
    {
        owner = new Person(newCardHolder);
        balance = new Money(0);
        creditLimit = new Money(limit);
    }

    public Money getBalance()
    {
        return balance;
    }
    
    public Money getCreditLimit()
    {
        return creditLimit;
    }
    
    public String getPersonals()
    {
        return owner.toString();
    }
    
    public void charge(Money amount)
    {
        double balance1 = balance.getMoney();
        double amount1 = amount.getMoney();
        double total = balance1 + amount1;
        
        if(total > creditLimit.getMoney())
        {
            System.out.println("Exceed credit limit");
        }
        else
            balance = new Money(total);
    }
    
    public void payment(Money amount)
    {
        double balance1 = balance.getMoney();
        double amount1 = amount.getMoney();
        double total = balance1 - amount1;
        balance = new Money(total);
    }
}