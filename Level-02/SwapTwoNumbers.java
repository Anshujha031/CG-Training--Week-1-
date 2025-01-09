import java.util.*;

class SwapTwoNumbers{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int swap = number1;
		number1 = number2;
		number2 = swap;
		
		System.out.println( "The swapped numbers are " + number1 + " and " + number2);
	}
}