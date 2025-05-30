public class Prog30 {
    public static void main(String[] args) {
        String str1="abc";
        String str2="Abc";
        boolean flag;
        flag=str1.equalsIgnoreCase(str2);

        if(flag){
            System.out.println("Given strings are equal");
        }
        else
            System.out.println("Given Strings are not equal");
    }
}
