import java.util.Scanner;

class Prog5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();


       int n1 = 0, n2 = 1;


       while(n1<5000) {
           System.out.print(n1+"  ");
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;

       }
    }
}