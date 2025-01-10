import java.util.*;

class HarshadNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = input.nextInt();
		
		int originalNumber = number;
		int sum = 0;
		
		while(number != 0){
		    int remainder = number % 10;
			sum += remainder;
			number = number/10;
		}
		
		if(originalNumber % sum == 0){
			System.out.println(originalNumber + " is a Harshad Number");
		}
		else{
			System.out.println(originalNumber + " is not a Harshad Number");
		}
	}
}