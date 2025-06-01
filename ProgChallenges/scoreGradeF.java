package ProgChallenges;
import java.util.Scanner;

public class scoreGradeF {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's score: ");
        int score = scanner.nextInt();

        char g;

        if (score >= 90) {
            g = 'A';
        } else if (score >= 80) {
            g = 'B';
        } else if (score >= 70) {
            g = 'C';
        } else if (score >= 60) {
            g = 'D';
        } else {
            g = 'F';
        }

        System.out.println("Student grade : " + g);

        scanner.close();
    }
}
