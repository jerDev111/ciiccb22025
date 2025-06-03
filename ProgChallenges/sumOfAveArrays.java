import java.util.Arrays;
import java.util.Scanner;

public class sumOfAveArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of values: ");
        int count = scanner.nextInt();
        
        int[] values = getNumbers(scanner, count);
        displayArray(values);
        
        int sum = computeSum(values);
        double average = (double) sum / count;
        
        displayResults(sum, average);
        scanner.close();
    }

    private static int[] getNumbers(Scanner scanner, int count) {
        int[] numbers = new int[count];
        System.out.println("\nEnter " + count + " numbers:");
        
        for (int i = 0; i < count; i++) {
            System.out.printf("Number %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    private static void displayArray(int[] numbers) {
        System.out.println("\nArray: " + Arrays.toString(numbers));
    }

    private static int computeSum(int[] numbers) {
        return Arrays.stream(numbers).sum();
    }

    private static void displayResults(int sum, double average) {
        System.out.println("\nSum: " + sum);
        System.out.printf("Average: %.2f%n", average);
    }
}
