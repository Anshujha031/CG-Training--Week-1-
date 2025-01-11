import java.util.*;

class Number
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		// Check numbers is positive
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0){
				if(arr[i]%2==0)
				{
					System.out.println("Even");
				}
				else
				{
					System.out.println("odd");
				}
			}
			else if(arr[i]<0) {
				System.out.println("Negative");
			}
			else {
				System.out.println("Zero");
			}
		}
		// Compare numbers
		
		if(arr[0]>arr[arr.length-1]){
			System.out.println("First number is greater than last");
		}
		else if(arr[0]<arr[arr.length-1]){
			System.out.println("Last number is greater than First");
		}
		else{
			System.out.println("Both the numbers are equal");
		}
		
	}
}