import java.util.Scanner;

public class Prog36 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int n=sc.nextInt();

        String a="";
        int alpha=65;
        while(alpha<65+n){
            a=a+(char)alpha;
            System.out.println(a);
            alpha++;
        }


    }
}
