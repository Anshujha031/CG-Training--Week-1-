import java.util.*;

class NullPointerException{
	
	public static void GenerateException(String s){
		s = null;
		s.length();
		
		
	}
	
	public static void HandleException(String s){
		 
		  try{
			   GenerateException(s);
			   }
			   catch(Exception e){
				   System.out.println("NullPointerException Caught ");
				   }
		}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.next();
		
       
		HandleException(str);
		try{
		 GenerateException(str);
		}
		catch(Exception e){
			System.out.println(e);
			}
		
		
	}
	
}