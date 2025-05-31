public class SplitFunction {
    public static void main(String[] args) {
        String s="welcome.ece$department";
        String regex="[.$]";
        String[] arr=s.split(regex);
        for(String s1:arr){
            System.out.println(s1);
        }
    }
}
