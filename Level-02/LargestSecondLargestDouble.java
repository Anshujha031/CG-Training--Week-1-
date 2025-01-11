import java.util.*;

class LargestSecondLargestDouble
{ 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int maxDigit = 10;
		int[] arr = new int[maxDigit];
		int index =0;
		
		while(number!=0){
			int digit = number%10;
			arr[index] = digit;
			index++;
			number = number/10;
			
			if(index==maxDigit){
				maxDigit = 2*maxDigit;
			}
		}
		int largest =-1;
		int secondLargest =-1;
		
		for(int i=0;i<index;i++){
			if(arr[i]>largest){
				secondLargest = largest;
				largest = arr[i];
				
			}
			else if(arr[i]>secondLargest && arr[i]!=largest){
				secondLargest = arr[i];
			}
		}
		
		System.out.println(largest);
		System.out.println(secondLargest);
		
		
	}
}