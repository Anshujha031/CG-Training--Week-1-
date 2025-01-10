import java.util.*;

class Prime
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		boolean isPrime = true;
		if(num==0 || num==1)
		{
			System.out.println("False");
		}
		else
		{
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					isPrime = false;
					break;
				}
			
				
			}
			System.out.println(isPrime);
		}
	}
	
}