import java.util.Scanner;

public class Lab6_Pro1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height feet->");
        double feet = input.nextDouble();
        System.out.print("Enter your height inches->");
        double inches = input.nextDouble();   
        BMI bmi = new BMI(name, age, weight, feet, inches);
        System.out.println("Your BMI is " + bmi.getBMI()+ "2");
        System.out.println("Your interpretation is " + bmi.getInterpretation());
        input.close();
    }
}
