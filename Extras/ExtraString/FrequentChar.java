public class MostFrequentCharacter {
    public static void main(String[] args) {
        String input = "success";

        // Array to store the frequency of each character
        int[] freq = new int[256]; // 256 for ASCII characters

        // Populate the frequency array
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            freq[ch]++;
        }

        // Find the most frequent character
        char mostFrequentChar = '\0';
        int maxFrequency = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > maxFrequency) {
                maxFrequency = freq[i];
                mostFrequentChar = (char) i;
            }
        }

        // Print the result
        System.out.println("Most Frequent Character: '" + mostFrequentChar + "' with frequency: " + maxFrequency);
    }
}
