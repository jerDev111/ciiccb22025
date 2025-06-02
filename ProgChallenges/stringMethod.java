package ProgChallenges;
import java.util.Scanner;

public class stringMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String insert = scanner.nextLine();

        System.out.println("String length: " + insert.length());
        System.out.println("String to uppercase: " + insert.toUpperCase());
        System.out.println("String to lowercase: " + insert.toLowerCase());
        System.out.println("First Character of String " + insert + " is: " + insert.charAt(0));
        System.out.println("Last Character of String " + insert + " is: " + insert.charAt(insert.length() - 1));
        System.out.println("Substring from the second character to the fifth, " + insert + " is: " + insert.substring(1, 5));
        scanner.close();
    }
    
}
