import java.util.Scanner;
public class Prog47 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int a=0;a<=i;a++) {
                System.out.print(" ");
            }
            for(int j=0;j<=n;j++) {
                System.out.print("*"+" ");

            }
            System.out.println();
        }

    }
}
