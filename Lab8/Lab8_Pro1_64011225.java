import java.util.Scanner;
import java.util.Arrays;

public class Lab8_Pro1_64011225 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input side1 :");
        double []side = new double[3];
        side[0] = input.nextDouble();
        System.out.print("Input side2 :");
        side[1] = input.nextDouble();
        System.out.print("Input side3 :");
        side[2] = input.nextDouble();
        System.out.print("Color :");
        input.nextLine();
        String Color = input.nextLine();
        System.out.print("Fill?(true/false) :");
        boolean filled = input.nextBoolean();
        Arrays.sort(side);
        Triangle triangle = new Triangle(Color,filled);
            triangle.setSide1(side[0]);
            triangle.setSide2(side[1]);
            triangle.setSide3(side[2]);

        System.out.println("-----------------------------");
        System.out.println(triangle.toString());
        input.close();

    }
}
