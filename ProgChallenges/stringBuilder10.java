package ProgChallenges;

import java.util.Scanner;

public class stringBuilder10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string minimum of 10 chars: ");
        String input = scanner.nextLine();

        if (input.length() < 10) {
            System.out.println("String must be at least 10 characters.");
        } else {
            StringBuilder sb = new StringBuilder(input);

            System.out.println("Length: " + sb.length());
            System.out.println("First: " + sb.charAt(0));
            System.out.println("Last: " + sb.charAt(sb.length() - 1));
            System.out.println("Index of 'a': " + sb.indexOf("a"));
            System.out.println("Substring (3-6): " + (sb.length() >= 6 ? sb.substring(3, 6) : "Too short"));

            sb.append("123").insert(4, "xyz").delete(2, 4);
            System.out.println("Modified: " + sb);

            System.out.println(sb.length() > 8 ? "After deleting index 8: " + sb.deleteCharAt(8) : "Can't delete index 8.");
            
            System.out.println("Reversed: " + sb.reverse());
        }

        scanner.close();
    }
}
