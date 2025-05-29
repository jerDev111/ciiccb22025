package TaskActivities;

public class Task9 {
    public static void main(String[] args) {
        int num1 = 1, num2 = 2;

        System.out.println("Addition: " + performAddition(num1, num2));
        System.out.println("Subtraction: " + performSubtraction(num1, num2));
        System.out.println("Multiplication: " + performMultiplication(num1, num2));
        System.out.println("Division: " + performDivision(num1, num2));
    }

    public static int performAddition(int a, int b) {
        return addExact(a, b);
    }

    public static int performSubtraction(int a, int b) {
        return subtractExact(a, b);
    }

    public static int performMultiplication(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float performDivision(int a, int b) {
        return floorDiv(a, b);
    }
}
