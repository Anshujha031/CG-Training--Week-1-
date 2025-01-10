import java.util.*;

class Factorial
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number>0)
		{
			int formula = number*(number+1)/2;
			int loop =0 ;
			for(int i=number ; i>0 ; i--)
			{
				loop *= i;
				
			}
			
			
			System.out.println(loop);
			
			
		}
		
		
	}
}