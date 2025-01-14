import java.util.*;

class ArrayIndexOutOfBoundsException{
	
	public static void GenerateException(int[] arr){
		System.out.println(arr[6]);
		}
	
	public static void HandleException(int[] arr){
		try{
			GenerateException(arr);
			}
			catch(Exception e){
				System.out.println("Exception caught " + e);
				}
		}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array");
		int size = sc.nextInt();
		System.out.println("Enter the array");
		int[] arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
			}
		
		
		GenerateException(arr);
		HandleException(arr);
		
	}
}