import java.util.*;

class EvenOdd
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number>=1){
			int size = number/2 + 1;
			int[] even = new int[size];
			int[] odd = new int[size];
			int indexEven = 0;
			int indexOdd = 0;
			for(int i=1;i<=number;i++){
				if(i%2==0){
					even[indexEven] = i;
					indexEven++;
				}
				else{
					odd[indexOdd] = i;
					indexOdd++;
				}
			}
			System.out.println("Even numbers: ");
			for(int i=1;i<=indexEven;i++){
				
				System.out.println(even[i] + " ");
			}
			
			
			System.out.println("odd numbers: ");
			for(int i=1;i<=indexOdd;i++){
				
				System.out.println(odd[i] + " ");
			}
			
			
		}
		else
		{
			System.out.println("error");
		}
	}
}			