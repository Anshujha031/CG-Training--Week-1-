import java.util.*;

public class UnitConverter2 {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9; // Conversion formula
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32; // Conversion formula
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592; // 1 pound = 0.453592 kilograms
        return pounds * pounds2kilograms; 
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462; // 1 kilogram = 2.20462 pounds
        return kilograms * kilograms2pounds; 
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541; // 1 gallon = 3.78541 liters
        return gallons * gallons2liters; 
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172; // 1 liter = 0.264172 gallons
        return liters * liters2gallons; 
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test conversions
        double fahrenheit = 100.0;
        double celsius = 37.0;
        double pounds = 150.0;
        double kilograms = 68.0;
        double gallons = 10.0;
        double liters = 20.0;

        // Display conversion results
        System.out.println(fahrenheit + " Fahrenheit is " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");
        System.out.println(celsius + " Celsius is " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");
        System.out.println(pounds + " pounds is " + convertPoundsToKilograms(pounds) + " kilograms.");
        System.out.println(kilograms + " kilograms is " + convertKilogramsToPounds(kilograms) + " pounds.");
        System.out.println(gallons + " gallons is " + convertGallonsToLiters(gallons) + " liters.");
        System.out.println(liters + " liters is " + convertLitersToGallons(liters) + " gallons.");
    }
}
