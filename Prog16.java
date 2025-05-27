import java.util.Scanner;

public class Prog16 {
    public static boolean isEven(int i) {

        if (i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the highest range:");
        int lar = sc.nextInt();

        System.out.println("Enter the lowest range:");
        int sma = sc.nextInt();

        for(int i=lar;i>=sma;i--){
            boolean a=isEven(i);
            if(a)
                System.out.println(i);
        }
    }
}
