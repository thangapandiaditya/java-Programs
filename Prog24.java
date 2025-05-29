import java.util.Scanner;

public class Prog24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the any integer:");
        String num=sc.next();
        System.out.print("The reverse number:");
        int count=0;
        for(int i=num.length()-1;i>=0;i--) {
            char temp = num.charAt(i);
            System.out.print(temp);
            count++;
              }
        System.out.println( );
        System.out.println("The no of digits:"+count);

        for(int i=num.length()-1;i>=0;i--){
                char temp=num.charAt(i);

                switch(temp){
                    case '0': {
                        System.out.print("zero ");
                        break;
                    }
                    case '1':{
                        System.out.print("one ");
                        break;
                    }
                    case '2':{
                        System.out.print("Two ");
                        break;
                    }
                    case '3':{
                        System.out.print("Three ");
                        break;
                    }
                    case '4':{
                        System.out.print("Four ");
                        break;
                    }
                    case '5':{
                        System.out.print("Five ");
                        break;
                    }
                    case '6':{
                        System.out.print("Six ");
                        break;
                    }
                    case '7':{
                        System.out.print("Seven ");
                        break;
                    }
                    case '8':{
                        System.out.print("Eight ");
                        break;
                    }
                    case '9':{
                        System.out.print("Nine ");
                        break;
                    }
                }
        }

    }
}
