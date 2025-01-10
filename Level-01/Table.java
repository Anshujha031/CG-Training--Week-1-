import java.util.*;

class Table
{ public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=6 ; i<=9; i++)
		{
			num *= i;
			System.out.println("format number*i " + num);
		}
	}
}