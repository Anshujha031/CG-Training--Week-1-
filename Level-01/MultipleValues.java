import java.util.*;

class MultipleValues
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[10];
		double totalSum = 0;
		int index = 0;
		
		while(true){
			double userInput = sc.nextDouble();
			
			if(userInput<=0){
				break;
			}
			if(index==10){
				break;
			}
			arr[index] = userInput;
			index++;
			
		}
		for(int i=0;i<index;i++){
			totalSum += arr[i];
		}
	
	for(int i=0;i<index;i++){
	System.out.println(arr[i]);
	}
	System.out.println(totalSum);
	}
	}
		