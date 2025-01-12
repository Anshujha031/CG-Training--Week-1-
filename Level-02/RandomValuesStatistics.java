import java.util.Random;

public class RandomValuesStatistics {

    public static void main(String[] args) {
        // Generate an array of 4-digit random numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Find average, minimum, and maximum values
        double[] results = findAverageMinMax(randomNumbers);

        // Display results
        System.out.println("Generated Random Numbers:");
        for (int number : randomNumbers) {
            System.out.println(number);
        }
        System.out.printf("Average: %.2f\n", results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] randomNumbers = new int[size];

        for (int i = 0; i < size; i++) {
            // Generate a random number between 1000 and 9999
            randomNumbers[i] = random.nextInt(9000) + 1000; // 1000 + [0, 9000)
        }

        return randomNumbers;
    }

    // Method to find average, minimum, and maximum values of an array
    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            sum += number; // Calculate sum
            min = Math.min(min, number); // Update minimum
            max = Math.max(max, number); // Update maximum
        }

        double average = sum / numbers.length; // Calculate average
        return new double[]{average, min, max}; // Return array containing average, min, max
    }
}
