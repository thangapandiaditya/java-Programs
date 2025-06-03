import java.util.Scanner;

public class Prog53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[][] =new int[2][5];

        int r,c;
        for(r=0;r<2;r++){
            for(c=0;c<5;c++){
                arr[r][c]=sc.nextInt();
            }
            System.out.println();
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
