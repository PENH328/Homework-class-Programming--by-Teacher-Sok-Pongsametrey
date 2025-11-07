import java.util.Scanner;

public class NumberChecker {

    // Helper method to check for prime
    public static boolean isPrime(int n) {
        // Numbers less than or equal to 1 are not prime
        if (n <= 1) {
            return false;
        }
        // Check for factors from 2 up to the square root of n (for efficiency)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Found a factor, so it's not prime
            }
        }
        return true; // No factors found, so it's prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");

        // --- Input ---
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a whole number.");
            scanner.close();
            return;
        }
        int number = scanner.nextInt();
        scanner.close();

        System.out.println("\n--- Analysis for " + number + " ---");

        // --- Check 1: Even ---
        // An even number is divisible by 2 (remainder is 0)
        String evenResult = (number % 2 == 0) ? "YES" : "NO";
        System.out.println("Is Even: " + evenResult);

        // --- Check 2: Divisible by 5 ---
        // A number divisible by 5 has a remainder of 0 when divided by 5
        String divBy5Result = (number % 5 == 0) ? "YES" : "NO";
        System.out.println("Is Divisible by 5: " + divBy5Result);

        // --- Check 3: Prime ---
        String primeResult = isPrime(number) ? "YES" : "NO";
        System.out.println("Is Prime: " + primeResult);
    }
}