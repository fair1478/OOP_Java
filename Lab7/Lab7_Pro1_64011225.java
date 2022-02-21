import java.util.Scanner;

public class Lab7_Pro1_64011225 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Account account = new Account();
        CheckingAccount checkingAccount = new CheckingAccount(1,5000 );
        SavingAccount savingAccount = new SavingAccount( 11 , 5000);
        checkingAccount.setOverOverdraftLimit(5000);

        System.out.println(checkingAccount.toString());
        System.out.println("Withdraw: 10000");
        checkingAccount.withdraw(10000);
        System.out.println("Balance is "+ checkingAccount.getBalance());
        System.out.println("This account was created at " + checkingAccount.getDateCreated());
        System.out.println("-------------------------------------");
        System.out.println(savingAccount.toString());
        System.out.println("Withdraw: 10000");
        savingAccount.withdraw(10000);
        System.out.println("Balance is "+ savingAccount.getBalance());
        System.out.println("This account was created at " + savingAccount.getDateCreated());
        input.close();
    }
}
