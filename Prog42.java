import java.util.Scanner;

public class Prog42 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first value:");
        int a=sc.nextInt();
        System.out.print("Enter the second value: ");
        int b=sc.nextInt();
        int max=(a+b+Math.abs(a-b))/2;
        int min=(a+b-Math.abs(a-b))/2;
        System.out.println("Maximum value:"+max);
        System.out.println("Minimum value:"+min);


    }



}
