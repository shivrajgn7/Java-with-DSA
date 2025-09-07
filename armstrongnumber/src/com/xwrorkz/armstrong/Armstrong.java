import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Store the original number for comparison
        int originalNumber = number;
        int result = 0;
        int digits = String.valueOf(number).length();

        // Calculate the sum of digits raised to the power of 'digits'
        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, digits);
            number /= 10;
        }

        // Check if it is an Armstrong number
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
