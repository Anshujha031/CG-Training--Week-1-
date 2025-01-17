import java.util.*;

class ReverseString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		
		String r = "";
		for(int i=s.length()-1;i>=0;i--){
		 char ch = s.charAt(i);
		 r += ch;
		}
		System.out.println("Reverse string " + r);
		
		
		
		
		
	}
}