import java.util.*;

class HandShakes{
	
	public int combination(int number)
	{
		int num = (number*(number-1))/2;
		return num;
		}
}





public class MaxHandShakes
{
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of students");
			int num = sc.nextInt();
			
			HandShakes hand = new HandShakes();
			System.out.println("The number of handshakes are");
			System.out.println(hand.combination(num));
			
			
		}
}