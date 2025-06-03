import java.util.Scanner;

public class numOfLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for the pattern: ");
        int rows = scanner.nextInt();
        
        printPattern(rows);
        
        scanner.close();
    }

    private static void printPattern(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
