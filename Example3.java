import java.util.Scanner;
public class Example3  {

    public static void main( String args[] ){
        Scanner sc = new Scanner( System.in );
        System.out.print("Input the starting number of the range: ");
        int rsnum = sc.nextInt();
        System.out.print("Input the ending number of the range: ");
        int renum = sc.nextInt();
        int random_num = (int) (rsnum +(Math.random() * ((renum - rsnum) + 1)));
        System.out.println(random_num);
    }
}
