package TaskActivities;

public class Task8 {
    

    public static int computeCumulativeSum(int... values) {
        int totalSum = 0;

        for (int value : values) {
            int currentSum = (value * (value + 1)) / 2;
            System.out.println("Cumulative sum for " + value + " = " + currentSum);
            totalSum += currentSum;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int finalSum = computeCumulativeSum(4, 5, 10);
        System.out.println("Total cumulative sum of all numbers = " + finalSum);
    }

}
