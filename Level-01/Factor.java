import java.util.*;

class Factor
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int maxFactor = 10;
		int[] factorArray = new int[maxFactor];
		int index=0;
		
		for(int i=1;i<=number;i++){
			if(number%i==0){
				factorArray[index] = i;
				index++;
			}
			if(index==maxFactor){
				maxFactor = maxFactor*2;
				int[] temp = new int[maxFactor];
				for(int j=0;j<factorArray.length;j++){
					temp[j] = factorArray[j];
				}
				factorArray = temp;
				
				
			}
			
		}
		for(int i=0;i<index;i++){
			System.out.println(factorArray[i]);
			
		}
		sc.close();
	}
	
}