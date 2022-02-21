public class Lab7_Pro2_64011225 {
    public static void main(String[] args) {
        NewAccount newAccount = new NewAccount("Fair",15,10000);
        newAccount.setAnnualInterestRate(1.65);
        System.out.println("Name : "+newAccount.getName()+"\nAccount ID: " + newAccount.getId() + "\nAnnual interest rate: " + newAccount.getAnnualInterestRate() 
        + "\nBalance: " + newAccount.getBalance());

        newAccount.deposit(30);
        newAccount.deposit(40);
        newAccount.deposit(50);
        newAccount.withdraw(5);
        newAccount.withdraw(4);
        newAccount.withdraw(2);

        System.out.print("Date\t\t\t\tType\tAmount\tBalance\n");
        for(int i=0;i<newAccount.getTransaction().size();i++)
            System.out.println(newAccount.getTransaction().get(i));
        
    }
}
