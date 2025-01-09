import java.util.*;

class Calculator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is " + (num1+num2) + "," + (num1-num2) + "," + (num1*num2) + " and " + (num1/num2) );
	}
}