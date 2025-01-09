import java.util.*;

class DoubleOperation{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double a = sc.nextInt();
		double b = sc.nextInt();
		double c = sc.nextInt();
		System.out.println("The result of Double Operation are " + (a+b)*c + " " + (a*b)+c + " " + c+(a/b) + " " + (a%b)+c );
}
}