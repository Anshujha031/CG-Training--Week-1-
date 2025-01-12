import java.util.*;

class Sum
{
	public int natural(int number){
		int sum=0;
		for(int i=1;i<=number;i++){
			sum+=i;
		}
		return sum;
	}
}

class SumNatural
{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	Sum s = new Sum();
	System.out.println("The sum of natural number is " + s.natural(num) );
		
	}
}