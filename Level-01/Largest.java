import java.util.*;

class Largest{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if(num1>num2 && num1>num3)
		{
		System.out.println("Is the first number the largest ? " + " YES " );
		System.out.println("Is the second number the largest ? " + " NO " );
		System.out.println("Is the Third number the largest ? " + " NO " );
		}
		else if(num2>num1 && num2>num3)
		{
		System.out.println("Is the first number the smallest ? " + " NO " );
		System.out.println("Is the second number the smallest ? " + " YES " );
		System.out.println("Is the third number the smallest ? " + " NO " );
		}
		else
		{
		System.out.println("Is the first number the smallest ? " + " YES " );
		System.out.println("Is the second number the smallest ? " + " NO " );
		System.out.println("Is the third number the smallest ? " + " YES " );
		}
		
	}
}