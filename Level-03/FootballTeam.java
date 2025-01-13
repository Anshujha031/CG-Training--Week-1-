import java.util.*;

class FootballTeam
{
	public static int findSum(int[] arr){
		int sum=0;						
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		return sum;
	}
	
	public static double findMean(int sum , int count){
		return  sum/count;
	}
	
	public static int shortHieght(int[] arr){
		int shortHieght = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<shortHieght){
				shortHieght=arr[i];
			}
		}
		return shortHieght;
		
	}
	public static int tallHeight(int[] arr){
		int tallHeight = arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>tallHeight){
				tallHeight = arr[i];
			}
		}
		return tallHeight;
		
	}
	
	public static void main(String[] args){
		int[] height = new int[11];
		for(int i=0; i<11; i++){
			height[i] = (int)(Math.random()*150)+250;
		}
		
		int sum = findSum(height);
		double mean = findMean(sum,height.length);
		int shortH = shortHieght(height);
		int tallHeight = tallHeight(height);
		
		System.out.println("Sum of heights: " + sum);
		System.out.println("Mean height: " + mean);
		System.out.println("Shortest height: " + shortH);
		System.out.println("Tallest height: " + tallHeight);
	}
	
	
	
}