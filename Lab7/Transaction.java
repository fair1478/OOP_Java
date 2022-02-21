import java.util.Date;
public class Transaction {
    Date date = new Date();
    char type;
    double amount;
    double balance;
    String description;

    Transaction(char type,double amount,double balance,String description){
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    public String getTransaction(){
        return date + "\t" + type +"\t"+ amount +"\t"+ balance;
    }

}
