import java.util.Scanner;

public class weight_calculate_on_mars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your weight in pounds? ");
        double weightOnEarth = scanner.nextDouble();
        double weightOnMars = weightOnEarth * 0.378;
        System.out.println("Your weight on Mars is " + weightOnMars + " pounds.");
    }
}