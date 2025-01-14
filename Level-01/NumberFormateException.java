import java.util.*;
class NumberFormateException{
	
	public static void GenerateException(String s){
		System.out.print("The parsed integer is: " + Integer.parseInt(s));
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
		String str = sc.next();
		
		GenerateException(str);
		HandleException(str);
	}
}