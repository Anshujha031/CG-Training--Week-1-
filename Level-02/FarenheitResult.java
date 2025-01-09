import java.util.*;

class FarenheitResult{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double celsius = sc.nextInt();
		double b = (celsius * (9/5)) + 32 ;
		System.out.println("The " + celsius + " celsius is " + b + " fahrenheit ");
}
}