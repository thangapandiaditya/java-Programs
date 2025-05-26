import java.util.Scanner;

class Prog12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the integer to start:");
        int a=sc.nextInt();
        int n=500-a;
            int[] j =new int[n];
        for(int i=a;i<n;i++) {
            j[i] = a;
            a++;
        }
        for(int k:j)
            System.out.println(k);

    }
}
