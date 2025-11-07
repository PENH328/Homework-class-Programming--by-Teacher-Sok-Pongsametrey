import java.util.Scanner;
import java.util.InputMismatchException;

public class NumberChecker {

    // Method to check if an integer is prime (reused logic from previous exercise)
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer to check: ");
            int number = scanner.nextInt();
            
            // Handle negative numbers for the checks
            int absNumber = Math.abs(number);

            System.out.println("\n--- Analysis of Number " + number + " ---");

            // 1. Prime Check
            if (isPrime(absNumber)) {
                System.out.println("1. Prime Check: The number " + absNumber + " is PRIME.");
            } else {
                System.out.println("1. Prime Check: The number " + absNumber + " is NOT prime.");
            }

            // 2. Even Check
            if (absNumber % 2 == 0) {
                System.out.println("2. Even Check: The number " + number + " is EVEN.");
            } else {
                System.out.println("2. Even Check: The number " + number + " is ODD.");
            }

            // 3. Divisible by 5 Check
            if (absNumber % 5 == 0) {
                System.out.println("3. Divisible by 5: The number " + absNumber + " IS divisible by 5.");
            } else {
                System.out.println("3. Divisible by 5: The number " + absNumber + " is NOT divisible by 5.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter a whole number (integer).");
        }
    }
}