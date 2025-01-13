import java.util.*;

class NumberChecker {
	
	//count the digit 
	public int countDigit(int number){
		int count=0;
		while(number!=0){
			int digit = number%10;
			count++;
			number = number/10;
			
		}
		return count;
	}
	
	//put digit in array
	public int[] digitArray(int number){
	int count = countDigit(number);
		int[] arr = new int[count];
		int index =count-1;
		
		while(number!=0){
			int digit = number%10;
			arr[index--] = digit;
			
			number = number/10;
			
		}
		return arr;
	}
	
	//Check the duck number
	public String checkDuckNumber(int number){
		int count=0;
		while(number!=0){
			int digit = number%10;
			if(digit==0){
				count++;
			}
			number = number/10;
		}
		if(count==0){
			return "The number is the Duck number" ;
		}
		else{
			return "The number is not the Duck number" ;
		}
		
	}
	
	public String checkArmstrong(int number){
		int[] digit = digitArray(number);
		int power = digit.length;
		int sum=0;
		for(int i=0;i<digit.length;i++){
			sum+=Math.pow(digit[i],power);
		}
		if(sum==number){
		 return "NOt a armstrong";
		}
		else{
		return "NOt a armstrong";
		}
	}
	
	public int[] largestSecondLargest(int number){
		int[] digit = digitArray(number);
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int i=0;i<digit.length;i++){
			if(digit[i]>largest){
				secondLargest = largest;
				largest = digit[i];
			}
			else if(digit[i]>secondLargest && digit[i]<largest){
				secondLargest = digit[i];
			}
		}
		return new int[]{largest,secondLargest};
	}
	
	public int[] smallestSecondSmallest(int number){
		int[] digit = digitArray(number);
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		
		for(int i=0;i<digit.length;i++){
			if(digit[i]<smallest){
				secondSmallest = smallest;
				smallest = digit[i];
			}
			else if(digit[i]< secondSmallest && digit[i] > smallest){
				secondSmallest = digit[i];
			}
		}
		return new int[]{smallest,secondSmallest};
	}
	
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int  number = sc.nextInt();
		
		NumberChecker a = new NumberChecker();
		
		int[] arr = a.digitArray(number);
		int[] largest = a.largestSecondLargest(number);
		int[] smallest = a.smallestSecondSmallest(number);
		System.out.println("The digit present in number: " + a.countDigit(number));
		
		System.out.println("Check duck: " + a.checkDuckNumber(number));
		System.out.println("Check Armstrong: " + a.checkArmstrong(number));
		System.out.println("Largest and Second Largest " + largest[0] + " " + largest[1]);
		System.out.println("Smallest and second Smallest: " + smallest[0]+ " " + smallest[1]);
		
		sc.close();
		}
}