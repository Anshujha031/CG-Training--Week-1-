public class WordReplacer {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog.";
        String wordToReplace = "fox";
        String replacementWord = "cat";

        // Call the replaceWord method
        String modifiedSentence = replaceWord(sentence, wordToReplace, replacementWord);
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Modified Sentence: " + modifiedSentence);
    }

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        // Use regular expressions to ensure whole word replacement
        return sentence.replaceAll("\\b" + wordToReplace + "\\b", replacementWord);
    }
}
