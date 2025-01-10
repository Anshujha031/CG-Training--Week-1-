import java.util.*;

class Bonus
{ public static void main(String[] args)
	{
		Scanner sc = sc.Scanner(System.in);
		int salary = sc.nextInt();
		int bonusamt = 0;
		int yearOfService = sc.nextInt();
		if(yearOfService>5)
		{
			bonusamt = (salary*5)/100;
			System.out.println(bonusamt);
			
		}
		else
		{
			System.out.println("No Bonus");
		}
	}
}