public class RemoveCharacter {
    public static void main(String[] args) {
        String input = "Hello World";
        char charToRemove = 'l';

        // Use StringBuilder to construct the modified string
        StringBuilder result = new StringBuilder();

        // Traverse the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            // Append only if the current character is not the one to remove
            if (currentChar != charToRemove) {
                result.append(currentChar);
            }
        }

        // Convert StringBuilder to String and print the result
        System.out.println("Modified String: " + result.toString());
    }
}
