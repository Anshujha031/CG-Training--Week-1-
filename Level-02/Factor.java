import java.util.*;

class Factor{
	
	public static int[] findFactor(int number){
		int count=0;
		for(int i=1;i<=number;i++){
			if(number%i==0){
				count++;
				
			}
		}
		int[] arr = new int[count];
		for(int i=1;i<=count;i++){
			if(number%i==0){
				arr[i]=i;
			}
		}
		
		return arr;
		
	}
	public static int factorSum(int[] factor){
		int sum=0;
		for(int i=0;i<factor.length;i++){
			sum+=factor[i];
		}
		return sum;
	}
	
	public static int factorProduct(int[] factor){
		int sum=1;
		for(int i=0;i<factor.length;i++){
			sum*=factor[i];
		}
		return sum;
	}
	public static int sumOfsq(int[] factor){
		int sum=0;
		for(int i=0;i<factor.length;i++){
			sum+=Math.pow(factor[i],2);
		}
		return sum;
	}
	
	
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = sc.nextInt();
	
	int[] factors = findFactor(number);
	
	//display factors
	System.out.println("Factor of number are ");
	for(int i=0;i<factors.length;i++){
	System.out.println(factors[i] + " ");
	}
	
	int sum = factorSum(factors);
	int product = factorProduct(factors);
	int sumOfSum = sumOfsq(factors);
	
	System.out.println("Sum of factors: " + sum);
	System.out.println("Product of factors: " + product);
	System.out.println("Sum of squares of factors: " + sumOfSum);
	}
	
	}	