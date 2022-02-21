import java.util.Random;
import java.util.Arrays;


public class Pro34 {
    public static void main(String[] args) {
        Random randomNum = new Random();
        StopWatch time = new StopWatch();
        System.out.println("Creating a list containing 1000 elements,");
        double []Num = new double[1000];
        for(int i=0;i<1000;i++)
        {
            if(i%5==0)
                System.out.print("\n");
             Num[i] = randomNum.nextDouble() * 1000;
            System.out.printf("%.2f\t" , Num[i]);
        }
        System.out.println("\nList created.");
        System.out.println("Sorting stopwatch starts...");
        time.start();
        Arrays.sort(Num);
        for(int i=0;i<1000;i++)
        {
            if(i%5==0)
                System.out.print("\n");
            System.out.printf("%.2f\t",Num[i]);
        }
        time.stop();
        System.out.println("\nThe sort time is "+ time.getElapsedTime()+ " milliSec");
        System.out.println("------------------------------");
        time.start();
        System.out.println("The palindromPrime stopwatch starts...");
        System.out.println("Creating 1000 PalindromPrime...");
        int N = 0;
       for(int i=2,k=0;N<1000;i++)
       {
            for(int j=2;j<=i;j++)
            {
                if(i%j == 0)
                    k++;
                    if(k>=2)
                    break;
            }
            if(k<=1)
            {
                for(int Num2 = i ,Palin = 0;;)
                {
                    Palin *=10;
                    Palin += Num2%10;
                    Num2/=10;
                    if(Num2<=0)
                    {
                        if(i==Palin)
                            {
                                System.out.print(Palin);
                                N++;
                                if(N%10==0)
                                    System.out.println();
                                else
                                    System.out.print(" ");
                            }
                        break;    
                    }
                }
            }
            k=0;
       }
       time.stop();
       System.out.println("PalindromePrime created.\nThe palindromPrime stopwatch stoped.");
       System.out.println("The palindromPrime time is "+ time.getElapsedTime() +" milliseconds");
    }
}
