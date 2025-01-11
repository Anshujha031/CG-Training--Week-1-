import java.util.*;

class Reverse
{ 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		
		int count=0;
		int temp = number;
		while(temp>0){
			
			 count++;
			 temp = temp/10;
			 
			 
			}
			temp =number;
			int[] arr = new int[count];
			for(int i=0;i<count;i++){
			
				 int digit = temp%10;
				 arr[i] = digit;
				 temp = temp/10;
				 
				}
				
				for(int i=0;i<count;i++){
					 System.out.print(arr[i] + " ");
					}
		
		}
}