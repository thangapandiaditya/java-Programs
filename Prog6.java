public class Prog6 {
    public static void main(String[] args) {
int count=0;
        for (int i = 1; i <= 99; i++) {

                 if (i <= 9) {
                     System.out.print("400" + "0" + i+" ");
                 } else {
                     System.out.print("400" + i + " ");
                 }
             count++;
            if(count%5==0){
                System.out.println();
            }


        }


    }
}

