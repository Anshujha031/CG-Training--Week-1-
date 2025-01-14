import java.util.*;

class StringOutOfBoundException{
	
	public static void GenerateException(String s){
		s.charAt(4);
		}
		
	public static void HandleException(String s){
		try{
			s.charAt(4);
			}
			catch(Exception e){
				System.out.println("Exception caught " + e);
				}
		}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		
		try{
			GenerateException(str);
			}
			catch(Exception e){
				System.out.println(e);
				}
		HandleException(str);
		
	}
}