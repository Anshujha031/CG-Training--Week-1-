import java.util.Scanner;

public class Quadratic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input coefficients a, b, c
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        
        // Calculate the roots
        double[] roots = findRoots(a, b, c);
        
        // Display the roots
        if (roots.length == 0) {
            System.out.println("The equation has no real roots (delta is negative).");
        } else if (roots.length == 1) {
            System.out.println("The equation has one real root: x = " + roots[0]);
        } else {
            System.out.println("The equation has two real roots: x1 = " + roots[0] + ", x2 = " + roots[1]);
        }

        // Close the scanner
        scanner.close();
    }

    // Method to find the roots of the quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c; // Calculate delta

        if (delta < 0) {
            // No real roots
            return new double[0]; // Return an empty array
        } else if (delta == 0) {
            // One real root
            double root = -b / (2 * a);
            return new double[]{root}; // Return array with one root
        } else {
            // Two real roots
            double root1 = (-b + Math.sqrt(delta)) / (2 * a);
            double root2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new double[]{root1, root2}; // Return array with two roots
        }
    }
}
