import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        System.out.println("Please enter text:");
        
        // Read input
        Scanner scanner = new Scanner(System.in);
        String inputText = scanner.nextLine();
        scanner.close();
        
        // Split input into words
        String[] words = inputText.split("\\s+");
        
        // Convert to lowercase
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toLowerCase();
        }
        
        Map<String, Integer> wordFrequencyMap = new TreeMap<>();
        
        // Iterate over words and update frequency
        for (String word : words) {
            if (wordFrequencyMap.containsKey(word)) {
                wordFrequencyMap.put(word, wordFrequencyMap.get(word) + 1);
            } else {
                wordFrequencyMap.put(word, 1);
            }
        }
        
        System.out.println("Word Frequencies:");
        for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
