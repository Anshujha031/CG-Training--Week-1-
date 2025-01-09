import java.util.*;

class IntOperation{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("The result of Int Operation are " + (a+b)*c + " " + (a*b)+c + " " + c+(a/b) + " " + (a%b)+c );
}
}