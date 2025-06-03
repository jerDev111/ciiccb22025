import java.util.Scanner;

public class ConstNumWords {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Word Counter ===");
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int wordCount1 = countWordsSimple(sentence);
        int wordCount2 = countWordsAdvanced(sentence);

        System.out.println("\nWord Count (Method 1): " + wordCount1);
        System.out.println("Word Count (Method 2): " + wordCount2);
        
        scanner.close();
    }

    private static int countWordsSimple(String sentence) {
        sentence = sentence.trim();
        return sentence.isEmpty() ? 0 : sentence.split("\\s+").length;
    }

    private static int countWordsAdvanced(String sentence) {
        sentence = sentence.trim();
        if (sentence.isEmpty()) return 0;

        int count = 0;
        boolean isWord = false;

        for (char c : sentence.toCharArray()) {
            if (Character.isWhitespace(c)) {
                isWord = false;
            } else if (!isWord) {
                count++;
                isWord = true;
            }
        }

        return count;
    }
}
