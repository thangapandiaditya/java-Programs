public class GlobalVariable {

    static int global_var = 40;

    public static void exampleFunction() {

        int x = 10;
        int y = 20;
        int z = x + y + global_var;
        System.out.println("The sum is: " + z);
        global_var=60;

    }

    public static void main(String[] args) {
        System.out.println(global_var);
        exampleFunction();
        System.out.println(global_var);
    }
}