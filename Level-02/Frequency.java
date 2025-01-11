import java.util.*;

class Frequency
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count=0;
		
		int temp = number;
		while(temp!=0)
		{    
			temp = temp/10;
			count++;
		}
		
		
		int[] arr = new int[count];
		
	    for(int i=0;i<count;i++){
			int digit = number%10;
			arr[i] = digit;
			number = number/10;
			
		}
		
		int[] farr = new int[10];
		
		for(int i=0;i<count;i++){
		    int digit = arr[i];
			farr[digit]++;
		}
		
		for(int i=0; i<10; i++){
			System.out.println(farr[i]);
		}
		 
		 
		 
	}
	
	
}