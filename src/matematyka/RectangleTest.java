package matematyka;

import java.util.Scanner;

public class RectangleTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();

        Rectangle r = new Rectangle(a, b);
        System.out.println("Area: " + r.calculateArea());
        System.out.println("Circumference: " + r.calculateCircumference());
    }


}
