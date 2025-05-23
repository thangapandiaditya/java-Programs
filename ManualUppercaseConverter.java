public class ManualUppercaseConverter {
    public static String toUpperCase(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase by subtracting 32 from ASCII value
                ch = (char)(ch - 32);
            }

            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "hello world!";
        String upper = toUpperCase(input);
        System.out.println("Uppercase: " + upper);
    }
}