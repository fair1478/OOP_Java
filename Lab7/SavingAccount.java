public class SavingAccount extends Account {
    
        public SavingAccount(){
            super();
        }
    
        public SavingAccount(int id, double balance) {
            super(id, balance);
        }
    
        public void withdraw(double WithdrawBalance){
            super.withdraw(WithdrawBalance);
        }
    
        public String toString(){
            return "SavingAccount" + "\nBalance is " + super.balance;  
        }
    }

