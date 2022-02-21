import java.util.Scanner;
public class Lab6_Pro6_64011225 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Account[] id = new Account[10];
        int numberOfId = 0 ;
        for(int i = 0;i < 10;i++)
        {
            id[i] = new Account(i,100);
        }

        boolean isTrueId = false;
        while(!isTrueId)
        {
            System.out.print("Enter an id : ");
            int inputId = input.nextInt();

            if(inputId > 9)
            {
                System.out.println("Incorrect ID ,pleas try again.");
            }
            else
            {
                isTrueId = true;
                numberOfId = inputId;
            }
        }

        boolean isRunning = true;
        while(isRunning)
        {
            System.out.println("Main menu");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");
            System.out.print("Enter a choice : ");
            int choice = input.nextInt();
            switch(choice)
            {
                case 1:
                System.out.println("The balance is " + id[numberOfId].getBalance());
                System.out.println("----------------------------------------------");
                break;
                case 2:
                System.out.print("Enter an amount to withdraw : ");
                double withdrawInput = input.nextDouble();
                id[numberOfId].withdraw(withdrawInput);
                System.out.println("----------------------------------------------");
                break;
                case 3:
                System.out.print("Enter an amount to deposit : ");
                double depositInput = input.nextDouble();
                id[numberOfId].deposit(depositInput);          
                System.out.println("----------------------------------------------");
                break;
                case 4:
                
                isRunning = false;
                break;
            }

        }

        System.out.println("End of Program");

        input.close();
    }
}
