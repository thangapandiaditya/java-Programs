import java.util.Scanner;
public class Prog40 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,sum = 0;
        double avg;
        System.out.print("Enter the value of N:");
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter the value "+(i+1)+":");
            a[i]=sc.nextInt();
        }
        for(int i:a){
            sum=sum+i;
        }
        avg=(float)sum/n;
        System.out.println("The average value :"+avg);
    }
}
