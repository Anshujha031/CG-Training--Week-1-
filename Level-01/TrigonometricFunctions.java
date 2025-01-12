import java.util.Scanner;

public class TrigonometricFunctions {
    
    // Method to calculate various trigonometric functions
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);
        
        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        // Return the results in an array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for an angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();
        
        // Calculate the trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);
        
        // Print the results
        System.out.printf("Sine of " + angle + results[0]);
        System.out.printf("Cosine " + angle + results[1]);
        System.out.printf("Tangent " + angle + results[2]);

        sc.close(); // Close the scanner
    }
}
