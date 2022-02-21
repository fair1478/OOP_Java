//import java.util.Scanner;
public class Lab7_Pro1_64011225 {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        Account[] id = new Account[10];
        CheckingAccount checkingAccount = new CheckingAccount(1,100);
        int numberOfId = 0 ;
        for(int i = 0;i < 10;i++)
        {
            id[i] = new Account(i,100);
        }
        System.out.print(checkingAccount.toString());
        
    }
    
}
