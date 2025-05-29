/* write a java program the input the gender based on the gender classification input age and
if age is less than 18 display schooling for female ,
 display schooling if age is less than 21 (for male).
 if age is greater than or equal to 18 and less than equal to 25 display higher studies for female.
 If age is greater than or equal to 21 and less than or equal to 30 display higher studies for male.
 */
import java.util.*;
public class Prog23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your gender male/female:");
        String gender=sc.nextLine();
        System.out.print("Enter your age:");
        int age=sc.nextInt();
        if(gender.equalsIgnoreCase("female")){
            if(age<18){
                System.out.println("Schooling");
            }
            else if(age>=18  && age<=25){
                System.out.println("Higher studies");
            }
            else{
                System.out.println("Invalid age");
            }

        }
        else if (gender.equalsIgnoreCase("male")){
            if(age<21){
                System.out.println("Schooling");
            }
            else if(age>=21  && age<=30){
                System.out.println("Higher studies");
            }
            else{
                System.out.println("Invalid age");
            }
        }
        else
            System.out.println("Invalid input");
    }
}
