import java.util.*;

class FizzBuzz
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		// Check number is positive or not 
		if(number>0){
			System.out.println("Yes number is negative");
			}
			else
			{
					System.out.println("No number is negative");
				}
				
				String[] arr = new String[number+1];
				
				for(int i=1;i<=number;i++){
				   if(i%3==0){
				    arr[i] = "Fizz";
				   }
				   else if(i%5==0){
					   arr[i] = "Buzz";
					   }
					   else if(i%3==0 && i%5==0){
						   arr[i] = "FizzBuzz";  
						   }
				}
				
				for(int i=1;i<=number;i++){
				  System.out.println("Position " + i  +  arr[i] );
				}
	}
}