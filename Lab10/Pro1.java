import java.util.Scanner;

public class Pro1 {
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        
        Scanner input = new Scanner(System.in);
        int []randomNum = new int[100];
        for(int i= 0;i<randomNum.length;i++)
        {
            randomNum[i] = (int)(Math.random()*100);
        }
        System.out.print("Input Index of Array :");
        int num = input.nextInt();

        try{
            System.out.print(randomNum[num]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Out of Bounds");
        }
        input.close();         
    }
}
