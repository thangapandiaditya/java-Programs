import java.util.Scanner;

public class PerfectNumberInRange {

    public static boolean isPerfect(int number) {
        int sum = 0;


        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        return sum == number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input range
        System.out.print("Enter the starting value of the range: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending value of the range: ");
        int end = scanner.nextInt();

        System.out.println("Perfect numbers between " + start + " and " + end + " are:");

        // Check each number in the range
        for (int i = start; i <= end; i++) {
            if (isPerfect(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
