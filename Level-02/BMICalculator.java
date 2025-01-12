// Find the Body Mass Index (BMI) and status of each individual
import java.util.*;

class BMICalculator{
	
	// Method to calculate BMI
	public static double calculateBMI(double weight, double height){
		return (weight / (height * height)) * 10000;
	}
	
	// Method to store status of each person in an array
	public static String[] getStatus(double[][] data){
	    String[] status = new String[10];
		for(int i=0; i<10; i++){
			if(data[i][2] <= 18.4){
				status[i] = "Underweight";
			}
			else if((data[i][2] >= 18.5) && (data[i][2] <= 24.9)){
				status[i] = "Normal";
			}
			else if((data[i][2] >= 25.0) && (data[i][2] <= 39.9)){
				status[i] = "Overweight";
			}
			else{
				status[i] = "Obese";
			}
		}
		
		return status;
	}
	
	public static void main(String[]args){
		
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		double[][] personData = new double[10][3];
		for(int i=0; i<10; i++){
		    System.out.println("Enter person weight(in kg)");
			personData[i][0] = input.nextDouble();
		    System.out.println("Enter person height(in cm)");
			personData[i][1] = input.nextDouble();
			
			personData[i][2] = calculateBMI(personData[i][0], personData[i][1]);
		}
		
		String[] status = getStatus(personData);
		
		for(int i=0; i<10; i++){
			System.out.println("BMI of person " + (i+1) + " is " + personData[i][2]);
			System.out.println("Status: " + status[i]);
		}
		
        // Close the Scanner Object
		input.close();
		}
	}