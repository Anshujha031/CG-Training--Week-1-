import java.util.*;

class GradeCalculator{
	
	public static int[][] randomMarks(int numStudent){
		   int[][] arr = new int[numStudent][3];
		   
		   Random random = new Random();
		   for(int i=0;i<numStudent;i++){
		   arr[i][0] = 10 + random.nextInt(90);
		   arr[i][1] = 10 + random.nextInt(90);
		   arr[i][2] = 10 + random.nextInt(90);
			   
			   }
			   return arr;
		   
		}
		
	public static double[][] score(int[][] arr){
	     int numStudent = arr.length;
		 double[][] metrics = new double[numStudent][3];
		 
		 for(int i=0;i<numStudent;i++){
			 int total = arr[i][0] + arr[i][1] + arr[i][2];
			 double average = total/3.0;
			 double percentage = (total/300.0)*100;
			 
			 metrics[i][0] = total;
		 metrics[i][1] = Math.round(average*100)/100;
		 metrics[i][2] = Math.round(percentage*100)/100;
			 }
			 return metrics;
		
		}
		
	// Method to calculate grades based on percentage
    public static String[] calculateGrades(double[][] metrics) {
        int numStudents = metrics.length;
        String[] grades = new String[numStudents];

        for (int i = 0; i < numStudents; i++) {
            double percentage = metrics[i][2];

            if (percentage >= 90) {
                grades[i] = "A+";
            } else if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

        return grades;
    }
	
	// Method to display the score card
	
	public static void display(int[][] arr , double[][] metrics , String[] grades){
		System.out.printf( "%-10s%-10s%-10s%-10s%-10s%-10s%-15s%-10s%n" ,"Student" , "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage", "Grade");
		
		for(int i=0;i<arr.length;i++){
			System.out.printf("%-10d%-10d%-10d%-10d%-10.0f%-10.2f%-15.2f%-10s%n", 
                              (i + 1), arr[i][0], arr[i][1], arr[i][2], 
                              metrics[i][0], metrics[i][1], metrics[i][2], grades[i]);
        }
			
		}
	
	
	
	
	
	public static void main(String[] args){
	int numStudent = 5;
	int[][] arr = randomMarks(numStudent);
	double[][] metrics = score(arr);
	String[] grades = calculateGrades(metrics);
	
	display(arr , metrics , grades);
		
	}
}