import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:");
        double number1 = scanner.nextDouble();

        System.out.print("Enter second number:");
        double number2 = scanner.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        double result;
        switch (choice) {
            case 1:
                result = number1 + number2;
                System.out.println("Result: " + number1 + " + " + number2 + " = " + result);
                
                break;
            case 2:
                result = number1 - number2;
                System.out.println("Result: " + number1 + " - " + number2 + " = " + result);
                break;
            case 3:
                result = number1 * number2;
                System.out.println("Result: " + number1 + " * " + number2 + " = " + result);
                break;
            case 4:
                if (number2 != 0) {
                    result = number1 / number2;
                    System.out.println("Result: " + number1 + " / " + number2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid operation.");
        }

        scanner.close();
    }
}
