import java.util.Scanner;

// Narcissistic Number Checker
public class Prog10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int temp = n;
        int sum = 0;

        int digits = String.valueOf(n).length();  // Get number of digits

        while (n > 0) {
            int digit = n % 10;
            sum = (int) (sum+Math.pow(digit, digits));  // Raise digit to the power of number of digits
            n = n/10;
        }

        if (sum == temp) {
            System.out.println(temp + " is a Narcissistic number.");
        } else {
            System.out.println(temp + " is not a Narcissistic number.");
        }
    }
}
