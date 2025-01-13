import java.util.*;

public class NumberChecker4 {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int[] tempFactors = new int[number]; // Temporary array to store factors
        int count = 0; // Count of factors found
        
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                tempFactors[count] = i; // Store factor
                count++;
            }
        }

        // Create an array of the exact size needed
        int[] factors = new int[count];
        for (int i = 0; i < count; i++) {
            factors[i] = tempFactors[i]; // Copy valid factors
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1]; // The last element is the greatest factor
    }

    // Method to find the sum of the factors using factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int i = 0; i < factors.length; i++) {
            sum += factors[i];
        }
        return sum;
    }

    // Method to find the product of the factors using factors array
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }
        return product;
    }

    // Method to find the product of the cube of the factors using the factors array
    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= Math.pow(factors[i], 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = sumOfFactors(findFactors(number));
        return sum - number == number; // Exclude the number itself from the sum
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sum = sumOfFactors(findFactors(number));
        return sum - number > number; // Exclude the number itself from the sum
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sum = sumOfFactors(findFactors(number));
        return sum - number < number; // Exclude the number itself from the sum
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int originalNumber = number;
        
        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }
        
        return sum == originalNumber;
    }

    // Helper method to calculate factorial
    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 28; // Example number

        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ": " + java.util.Arrays.toString(factors));
        System.out.println("Greatest factor: " + greatestFactor(factors));
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Product of cubes of factors: " + productOfCubesOfFactors(factors));
        System.out.println("Is " + number + " a perfect number? " + isPerfectNumber(number));
        System.out.println("Is " + number + " an abundant number? " + isAbundantNumber(number));
        System.out.println("Is " + number + " a deficient number? " + isDeficientNumber(number));
        System.out.println("Is " + number + " a strong number? " + isStrongNumber(number));
    }
}
