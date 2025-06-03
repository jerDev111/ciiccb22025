import java.util.Scanner;

public class sumofallinteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers separated by commas: ");
        String input = scanner.nextLine();

        int sum = calculateSum(input);
        System.out.println("Total sum: " + sum);

        scanner.close();
    }

    private static int calculateSum(String input) {
        int total = 0;
        for (String num : input.split(",")) {
            total += Integer.parseInt(num.trim());
        }
        return total;
    }
}
