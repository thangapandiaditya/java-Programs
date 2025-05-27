import java.util.Scanner;

public class Prog17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any integer:");
        int n=sc.nextInt();
        int temp=n;
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
        int arm=0;
        int n1=temp;
        while (n1!=0){
            int a=n1%10;
            arm= (int) (arm+Math.pow(a,count));
            n1=n1/10;
        }
        if(arm==temp){
            System.out.println("The given number is armstrong");

        }
        else
            System.out.println("The given number is not a armstrong number");
    }
}
