import java.util.*;

class LongestWord{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String[] s = sc.nextLine().split(" ");
		//String[] str = s.split(" ");
		String longest = "";
		
		for( String w : s){
		  if(w.length()>longest.length())
		  {
			 longest = w;
			  }	
			}
			
			
			System.out.println(longest);
			
		
		
		
		
		
	}
}
