import java.util.*;

class ArmstrongNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int sum = 0;
		int originalNumber  = number;
		
		while(number != 0){
			int remainder = number % 10;
			sum += Math.pow(remainder, 3);
			number = number/10;
		}
		
		if(sum == originalNumber){
			System.out.println(originalNumber + " is Armstrong number");
		}
		else{
			System.out.println(originalNumber + " is not Armstrong number");
		}
	}
}