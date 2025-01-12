import java.util.Scanner;

public class NumberCheck {

    // Method to check if a number is positive or negative
    public static String isPositive(int number) {
        return number >= 0 ? "positive" : "negative";
    }

    // Method to check if a number is even or odd
    public static String isEven(int number) {
        return number % 2 == 0 ? "even" : "odd";
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1; // number1 is greater
        } else if (number1 < number2) {
            return -1; // number1 is less
        } else {
            return 0; // both are equal
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Check each number for positive/negative and even/odd
        for (int i = 0; i < numbers.length; i++) {
            String positivity = isPositive(numbers[i]);
            if ("positive".equals(positivity)) {
                String evenOrOdd = isEven(numbers[i]);
                System.out.println(numbers[i] + " is " + positivity + " and " + evenOrOdd + ".");
            } else {
                System.out.println(numbers[i] + " is " + positivity + ".");
            }
        }

        // Compare first and last elements
        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("The first element is greater than the last element.");
        } else if (comparisonResult == -1) {
            System.out.println("The first element is less than the last element.");
        } else {
            System.out.println("The first element is equal to the last element.");
        }

        // Close the scanner
        scanner.close();
    }
}
