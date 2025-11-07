import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberUtility {

    /**
     * Checks if the given integer is a prime number.
     * @param n The integer to check.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int n) {
        // 1. Handle non-prime edge cases
        if (n <= 1) {
            return false;
        }

        // 2. Check for divisibility from 2 up to the square root of n (optimization)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Found a factor, so it's not prime
            }
        }
        return true; // No factors found, so it's prime
    }

    /**
     * Reverses the digits of the given integer.
     * @param n The integer to reverse.
     * @return The integer with reversed digits.
     */
    public static int reverseNumber(int n) {
        int reversed = 0;
        int original = Math.abs(n); // Work with the absolute value to handle negative numbers

        while (original != 0) {
            int digit = original % 10; // Get the last digit
            reversed = reversed * 10 + digit; // Append it to the reversed number
            original /= 10; // Remove the last digit from the original number
        }

        // Apply the original sign back to the reversed number
        return (n < 0) ? -reversed : reversed;
    }

    public static void main(String[] args) {
        // Use try-with-resources to ensure the Scanner is closed
        try (Scanner scanner = new Scanner(System.in)) {
            int choice = -1;

            while (choice != 3) {
                System.out.println("\n--- Number Utility Menu ---");
                System.out.println("1. Check if a number is Prime");
                System.out.println("2. Reverse a number");
                System.out.println("3. Exit");
                System.out.print("Enter your choice (1-3): ");

                try {
                    choice = scanner.nextInt();
                    if (choice >= 1 && choice <= 2) {
                        System.out.print("Enter the integer: ");
                        int number = scanner.nextInt();

                        switch (choice) {
                            case 1:
                                String primeResult = isPrime(number) ? "IS" : "IS NOT";
                                System.out.println("\nResult: " + number + " " + primeResult + " a Prime number.");
                                break;
                            case 2:
                                int reversed = reverseNumber(number);
                                System.out.println("\nResult: The reverse of " + number + " is " + reversed + ".");
                                break;
                        }
                    } else if (choice == 3) {
                        System.out.println("Exiting program. Goodbye!");
                    } else {
                        System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a whole number for your choice and input.");
                    scanner.next(); // Clear the invalid input from the buffer
                }
            }
        }
    }
}