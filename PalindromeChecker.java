import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create StringBuffer and reverse it
        StringBuffer original = new StringBuffer(input);
        StringBuffer reversed = new StringBuffer(input).reverse();

        // Check if original and reversed strings are equal
        if (original.toString().equalsIgnoreCase(reversed.toString())) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }

        scanner.close();
    }
}
