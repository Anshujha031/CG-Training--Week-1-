import java.util.*;

class NaturalNumber{
	
public static int findSum(int n){
	if(n==0){
	return 0;
	}
	return n + findSum(n-1);
}

public static int sumByFormula(int n){
	if(n==0){
		return 0;
		}
	return n*(n+1)/2;
	
}





public static void main(String[] args){
	Scanner sc =  new Scanner(System.in);
	int number = sc.nextInt();
	int recursive = findSum(number);
	int formula = findSum(number);
	if(recursive==formula){
		System.out.println("Both the result match " + recursive);
		}
		else{
			System.out.println("Both are not matched");
			}
}
}