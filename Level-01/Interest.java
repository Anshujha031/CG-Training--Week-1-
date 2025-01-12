import java.util.*;

class SimpleInterest
{
	public int calculateSimpleInterest(int principal , int rate , int time)
	{
	int interest = (principal*rate*time)/100;
		return interest;
		}
}

public class Interest{

 public static void main(String[] args)
 
{     
	    Scanner sc = new Scanner(System.in);
		
		//taking input 
		System.out.println("Enter the principal");
		int principal = sc.nextInt();
		System.out.println("Enter the rate");
		int rate = sc.nextInt();
		System.out.println("Enter the time");
		int time = sc.nextInt();
		
		SimpleInterest simple = new SimpleInterest();
		
		
		System.out.println("Simple Interest is " + simple.calculateSimpleInterest(principal,rate,time) );
		
		sc.close();
	 }
}