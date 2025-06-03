public class Prog51 {
    public static void main(String[] args) {
        int[] even=new int[50];
        int[] odd=new int[50];
        int o=0;
        int e=0;
         for(int j=500;j<600;j++)
         {
             if(j%2==0)
              {
             even[e]=j;
             e++;
             }
         else{
             odd[o]=j;
             o++;
         }
         }


        for(int ev:even){
            System.out.print(ev+" ");
        }
        System.out.println();
        for(int od:odd){
            System.out.print(od+" ");
        }

    }
}
