public class ReverseStringUsingBuffer {
    public static void main(String[] args) {
        String input = "Aditya";

        // Create a StringBuffer object with the input string
        StringBuffer sb = new StringBuffer(input);

        // Output the reversed string
        System.out.println("Reversed String: " + sb.reverse());
    }
}
