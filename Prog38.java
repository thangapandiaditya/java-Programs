import java.util.Scanner;

public class Prog38 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of rows:");
        int r=sc.nextInt();
        System.out.print("Enter the number to display");
        int d=sc.nextInt();
        for(int i=r;i>=1;i--){
            for(int j=1;j<=i;j++) {
                System.out.print(d+" ");
            }
            System.out.println();
        }

    }
}
