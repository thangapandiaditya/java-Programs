import java.util.Scanner;

public class Prog37 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of rows:");
        int r=sc.nextInt();
        System.out.print("Enter the no of columns:");
        int c=sc.nextInt();

        for(int i=1;i<=r;i++){
           for(int j=c;j>=i;j--){
               System.out.print(j+" ");
           }
           System.out.println();
        }
    }
}
