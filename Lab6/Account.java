import java.util.Date;

public class Account
{
    private int id ;
    double balance ;
    private static double annualInterestRate ;
    private Date dateCreated ;

    Account()
    {
       this.id = 0;
       this.balance = 0;
       annualInterestRate = 0;
    }

    Account(int id,double balance)
    {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public int getId()
    {
        return this.id;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getBalance()
    {
        return this.balance;
    }

    public void setAnnualInterestRate(double annualInterestRateSetting)
    {
        annualInterestRate = annualInterestRateSetting;
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public Date getDateCreated()
    {
        return this.dateCreated;
    }

    public double getMonthlyInterestRate()
    {
        return annualInterestRate/12;
    }

    public double getMonthlyInterest()
    {
        return balance * (annualInterestRate/12);
    }

    public void withdraw(double Wbalance)
    {
        if(this.balance >= Wbalance)
        {
            this.balance -= Wbalance;
        }
        else
        {
            System.out.println("Don't have enough money for withdraw.");
        }
    }

    public void deposit(double Wbalance)
    {
        this.balance += Wbalance;
    }


}

class CheckingAccount extends Account
{
    double OverdraftLimit = super.balance;

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }
    public void withdraw(double WithdrawBalance){
        if(OverdraftLimit < WithdrawBalance)
            super.withdraw(WithdrawBalance);
    }

    public String toString(){
        return "CheckingAccount" + "\nOverdraft Limit: " + OverdraftLimit + "\nBalance is " + super.balance;  
    }
}