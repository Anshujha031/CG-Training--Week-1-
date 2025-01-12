import java.util.*;

class Number
{
public static int[] findRemainderAndQuotient(int number, int divisor) {
	int r = number%divisor;
	int q = number/divisor;
	return new int[] {r,q};
	
}
}

class RemainderAndQuotient
{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number and divisor");
	int num = sc.nextInt();
	int divisor = sc.nextInt();
	
	int[] result = Number.findRemainderAndQuotient(num,divisor);
	System.out.println("The remainder and quotient are " + result[0] + " " + result[1]);
	
	sc.close();
}
}