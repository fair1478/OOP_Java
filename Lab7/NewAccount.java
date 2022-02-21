import java.util.ArrayList;
import java.util.Date;

public class NewAccount
{
    String name;
    private int id ;
    double balance ;
    private static double annualInterestRate ;
    private Date dateCreated ;
    ArrayList <String> transactions = new ArrayList<>();

    NewAccount()
    {
       this.id = 0;
       this.balance = 0;
       annualInterestRate = 0;
    }

    NewAccount(int id,double balance)
    {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }
    
    NewAccount(String name,int id,double balance)
    {
        this.name = name;
        this.id = id;
        this.balance = balance;
        this.dateCreated = new Date();
    }

    public String getName(){
        return name;
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
            Transaction transaction = new Transaction('W', Wbalance, balance, "" );
            transactions.add(transaction.getTransaction());
        }
        else
        {
            System.out.println("Don't have enough money for withdraw.");
        }


    }

    public void deposit(double Wbalance)
    {
        this.balance += Wbalance;
        Transaction transaction = new Transaction('D', Wbalance, balance, "" );
        transactions.add(transaction.getTransaction());
    }

    public ArrayList <String> getTransaction(){
        return transactions;
    }
}