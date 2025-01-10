import java.util.*;

class Number{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number<0)
		{
		System.out.println("negtaive");
		}
		else if(number>0)
		{
		System.out.println("positive");
		}
		else
		{
		System.out.println("Zero");
		}
		
	}
}