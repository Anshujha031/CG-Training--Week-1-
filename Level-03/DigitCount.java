import java.util.*;

class DigitCount{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = input.nextInt();
		
		int count = 0;
		
		while(number != 0){
			number = number/10;
			count++;
		}
		
		System.out.println("Number of digits in a number is " + count);
	}
}