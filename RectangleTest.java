package lab2_software_construction_dvelopment;

import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating a Rectangle object with default values
        Rectangle rectangle = new Rectangle();
        System.out.println("Default Rectangle:");
        displayRectangle(rectangle);

        // Prompt user for length and width values
        try {
            System.out.print("\nEnter length (between 0.0 and 20.0): ");
            double length = scanner.nextDouble();
            rectangle.setLength(length);

            System.out.print("Enter width (between 0.0 and 20.0): ");
            double width = scanner.nextDouble();
            rectangle.setWidth(width);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Display updated rectangle details
        System.out.println("\nUpdated Rectangle:");
        displayRectangle(rectangle);

        scanner.close();
    }

    // Method to display rectangle properties
    private static void displayRectangle(Rectangle rectangle) {
        System.out.println("Length       : " + rectangle.getLength());
        System.out.println("Width        : " + rectangle.getWidth());
        System.out.println("Area         : " + rectangle.calculateArea());
        System.out.println("Perimeter    : " + rectangle.calculatePerimeter());
    }
}
