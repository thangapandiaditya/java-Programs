// Java code to illustrate
// logical AND operator
import java.io.*;

class Geeks {
    public static void main(String[] args)
    {
        // initializing variables
        int a = 10, b = 20, c = 20, d = 0;

        // Displaying a, b, c
        System.out.println("Var1 = " + a);
        System.out.println("Var2 = " + b);
        System.out.println("Var3 = " + c);
        System.out.println(a!=b);
        System.out.println(a>b && b<=c);
        System.out.println(a>b || b<=c);

//        // using logical AND to verify
//        // two constraints
//        if ((a < b) && (b == c)) {
//            d = a + b + c;
//            System.out.println("The sum is: " + d);
//        }
//        if((a < b) || (b == c)){
//            System.out.println("The example for or operator");
//        }
//
//        else
//            System.out.println("False conditions");
  }
}