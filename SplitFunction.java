public class SplitFunction {
    public static void main(String[] args) {
        String s="welcome$ece";
        String regex="[$]";
        String[] arr=s.split(regex);
        for(String s1:arr){
            System.out.println(s1);
        }
    }
}
