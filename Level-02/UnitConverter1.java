import java.util.*;

public class UnitConverter1 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3.0; // 1 yard = 3 feet
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333; // 1 foot = 0.333333 yards
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701; // 1 meter = 39.3701 inches
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254; // 1 inch = 0.0254 meters
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54; // 1 inch = 2.54 centimeters
        return inches * inches2cm;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test conversions
        double yards = 5.0;
        double feet = 15.0;
        double meters = 2.0;
        double inches = 10.0;

        // Display conversion results
        System.out.println(yards + " yards is " + convertYardsToFeet(yards) + " feet.");
        System.out.println(feet + " feet is " + convertFeetToYards(feet) + " yards.");
        System.out.println(meters + " meters is " + convertMetersToInches(meters) + " inches.");
        System.out.println(inches + " inches is " + convertInchesToMeters(inches) + " meters.");
        System.out.println(inches + " inches is " + convertInchesToCentimeters(inches) + " centimeters.");
    }
}
