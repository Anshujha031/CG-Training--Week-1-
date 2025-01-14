import java.util.*;

class IllegalArgumentException{
	
	public static  void GenerateException(String s){
		System.out.println("Attempting to create an exception...");
		
		System.out.println("Substring result: " + s.substring(5,1) );
	}
	
	public static void HandleException(String s){
	    try{
		GenerateException(s);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	
	
	
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String");
		String str = sc.next();
		
		try{
			GenerateException(str);
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		HandleException(str);
		sc.close();
	}
}