import java.util.Date;
public class Account {
    
    private int id;
    private double balance;
    private static double annualInterestRate;
    Date dateCreated = new Date();

    public Account(){
        this.id = 0;
        this.balance = 0.0;
        annualInterestRate = 0.0;
    }

    public Account(int id,double balance){
        this.id = id;
        this.balance = balance;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public static void setAnnualInterestRate(double InputAnnualInterestRate){
        annualInterestRate = InputAnnualInterestRate;
    }

    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public double getMonthlyInterestRate(double annualInterestRate){
        return annualInterestRate /12;
    }

    public double getMonthlyInterest() {
        return balance * (annualInterestRate / (12*100));
    }

    public void withdraw(double Withdarw){
        balance -= Withdarw;
    }
    public void deposit(double Deposit){
        balance += Deposit;
    }

}
