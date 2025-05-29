/* java program to input a number between 1 and 9999 and display the number in the word format
test case:
input :153
output : one five three
test case 2:
input :045
output :zero four five
 */
import java.util.*;

import static java.lang.Integer.parseInt;

public class Prog21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the any value  convert to word:");
        String n=sc.next();
      try {
          int n1=parseInt(n);
          if (n1 >= 0 && n1 <= 9999) {

              for (int i = 0; i < n.length(); i++) {
                  char temp = n.charAt(i);

                  if (temp == '0')
                      System.out.print("zero ");
                  else if (temp == '1')
                      System.out.print("one ");
                  else if (temp == '2')
                      System.out.print("Two ");
                  else if (temp == '3')
                      System.out.print("Three ");
                  else if (temp == '4')
                      System.out.print("Four ");
                  else if (temp == '5')
                      System.out.print("Five ");
                  else if (temp == '6')
                      System.out.print("Six ");
                  else if (temp == '7')
                      System.out.print("Seven ");
                  else if (temp == '8')
                      System.out.print("Eight ");
                  else if (temp == '9')
                      System.out.print("Nine ");
                  else
                      System.out.print("invalid input");
              }
          }
      }catch(Exception e) {

          System.out.println("Invalid input");
      }



       }
    }

