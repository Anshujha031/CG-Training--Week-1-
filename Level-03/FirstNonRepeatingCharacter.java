import java.util.*;

class FirstNonRepeatingCharacter{

    // Method to find the first non-repeating character in a string
    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string all in lowercase or in uppercase: ");
        String text = input.nextLine();

        char result = findFirstNonRepeatingChar(text);

        if (result != '\0') {
            System.out.println("The first non-repeating character is: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        input.close();
    }
}
