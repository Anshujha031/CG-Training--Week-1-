import java.util.*;

class CelsiusResult{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double fahrenheit = sc.nextInt();
		double b = (fahrenheit * (9/5)) + 32 ;
		System.out.println("The " + fahrenheit + " fahrenheit is " + b + " celsius ");
}
}