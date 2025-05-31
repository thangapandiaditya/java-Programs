import java.util.Scanner;

public class Prog41 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            System.out.print("Enter the value "+(i)+":");
            int a=sc.nextInt();
            sum=sum+a;
        }
        double avg;
        System.out.println(sum);
        avg=(float)sum/n;
        System.out.println("The Average value:"+avg);

    }
}
