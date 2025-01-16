import java.util.*;

class AgeStudents{
	
	
	public static int[] randomNumber(int num){
	      
		  int[] age = new int[num];
          //Usinf Rnadom to generate random ages
		  Random random = new Random();
		  for(int i=0;i<num;i++){
			  age[i] = random.nextInt(90) +10;
			  }
			  return age;
		  
		}
	
	public static String[][] validationForVote(int[] age){
	String[][] result = new String[age.length][2];
		
		for(int i=0;i<age.length;i++){
		//storing the value of age
			result[i][0] = String.valueOf(age[i]);
			
			if(age[i] < 0){
				
				result[i][1] = "False";
				}
			else if(age[i] >= 18){
				result[i][1] = "True";
				}
			else{
				result[i][1] = "False";
				}
			
			}
			return result;
		}
	
	//display the 2d array
	
	public static void display(String[][] arr){
		System.out.println("Age " + " validation for vote ");
		 System.out.println("------------------------------");
		 
		 for(String[] row : arr){
			 System.out.println(row[0] + "\t" + row[1]);
			 }
		}

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int[] age = randomNumber(num);
	String[][] str = validationForVote(age);
	
	display(str);
	
	
}
}