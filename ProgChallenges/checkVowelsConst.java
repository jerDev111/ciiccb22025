import java.util.Scanner;

public class checkVowelsConst{
    private static final Scanner scanner = new Scanner(System.in);
    private static final char[] VOWELS = {'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) {
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        int vowelCount = countVowels(sentence);
        int consonantCount = countConsonants(sentence);

        System.out.println("\nVowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);

        scanner.close();
    }

    private static int countVowels(String sentence) {
        int count = 0;
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (isVowel(c)) count++;
        }
        return count;
    }

    private static int countConsonants(String sentence) {
        int count = 0;
        for (char c : sentence.toLowerCase().toCharArray()) {
            if (!isVowel(c) && Character.isLetter(c)) count++;
        }
        return count;
    }

    private static boolean isVowel(char character) {
        for (char v : VOWELS) {
            if (v == character) return true;
        }
        return false;
    }
}
