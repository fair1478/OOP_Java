public class CheckingAccount extends Account {
    double OverdraftLimit;

    public CheckingAccount(){
        super();
    }

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    public void setOverOverdraftLimit(double OverdraftLimit){
        this.OverdraftLimit = OverdraftLimit;
    }

    public void withdraw(double WithdrawBalance){
        if(balance - WithdrawBalance  + OverdraftLimit >= 0)
            this.balance -= WithdrawBalance;
        else 
            System.out.println("Cannot Withdraw");
    }

    public String toString(){
        return "CheckingAccount" + "\nOverdraft Limit: " + OverdraftLimit + "\nBalance is " + super.balance;  
    }
}
