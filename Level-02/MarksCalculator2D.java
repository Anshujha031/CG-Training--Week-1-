import java.util.*;

class MarksCalculator2D
{
	public static void main(String[] args){
	 Scanner sc = new Scanner(System.in);
	 
	 //input the studenst
	 System.out.println("Tell me the number of Students");
	 int number = sc.nextInt();
	 int[][] physicsMarks= new int[number][3];
	 int[][] chemistryMarks= new int[number][3];
	 int[][] mathsMarks= new int[number][3];
	 int[] percentage = new int[number];
	 int[] grades = new int[number];
	 
	 for(int i=0;i<number;i++){
	   for(int j=0;j<3;j++){
	 //input the marks os the subjects
	     System.out.println("Enter the marks of physics of student " + i );
		 physicsMarks[i][j] = sc.nextInt();
		 System.out.println("Enter the marks of chemistry of student " + i);
	   chemistryMarks[i][j] = sc.nextInt();
		 System.out.println("Enter the marks of maths of student " + i);
		 mathsMarks[i][j] = sc.nextInt();
		 //calculate percentage
		 
	 percentage[i] = (physicsMarks[i][j] + chemistryMarks[i][j] + mathsMarks[i][j])/3;
	 //Display marks of each subjects
	 System.out.println("Physic marks " + physicsMarks[i][j]);
	 System.out.println("chemistry marks " + chemistryMarks[i][j]);
	 System.out.println("Maths marks " + mathsMarks[i][j]);
	 //display percentage
	 System.out.println("The percentage of student " + i + percentage[i]);
	 
	 //finding grades and display grandes
	 if(percentage[i] >= 80){
		 System.out.println("Grade A");
		 }
	 else if(percentage[i] >= 70 || percentage[i] <= 79){
			 System.out.println("Grade B");
			 }
	 else if(percentage[i] >= 60 && percentage[i] <= 69){
				 System.out.println("Grade C");
				 }
	 else if(percentage[i] >= 50 && percentage[i] <= 59){
					 System.out.println("Grade D");
					 }
	 else if(percentage[i] >= 40 && percentage[i] <= 49){
						 System.out.println("Grade E");
						 }
						 else{
						 System.out.println("Grade R");
						 }
						 
						 System.out.println("Enter the details of next student");
		 
	
	}
	    }
	}
}