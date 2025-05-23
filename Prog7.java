public class Prog7 {
    public static void main(String[] args) {
        String str="Aditya";
        String str1="Thangapandi";

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.length());
        System.out.println(str.concat(str1));


        for(int i=str.length()-1;i>=0;i--){
           System.out.print(str.charAt(i));
        }
    }
}
