import java.util.Scanner;

public class Prog31 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the first string:");
      String s1=sc.next();
      System.out.println("Enter the second string:");
      String s2=sc.next();
      int l1=s1.length();
      int l2=s2.length();
      String s3="";
        if ((l1==5) &&(l2==5) ) {
            for (int i = 0; i < s1.length(); i++) {
               s3 +=s1.charAt(i);
               s3 +=s2.charAt(i);
            }
            System.out.println(s3);
        }
        else{
            System.out.println("String length exceeds the 5");
        }
    }
}
