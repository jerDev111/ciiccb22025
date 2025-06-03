public class MultiplicationTable {
    private static final int MAX_SIZE = 10;

    public static void main(String[] args) {
        printMultiplicationTable(MAX_SIZE);
    }

    private static void printMultiplicationTable(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print(row * col + "\t");
            }
            System.out.println();
        }
    }
}
