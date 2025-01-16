import java.util.*;


class FindLength{
	
	public static int LengthWithoutBuilt(String s){
		int count=0;
		try{
		    int i=0;
			while(true){
				if(s.charAt(i)!=' '){
					count++;
					i++;
				}
				
				
			}
			
		}
		catch(Exception e){
			System.out.println(e);
			return count;
		}
		
	}
	
	
	
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		System.out.println("The length comes from built-in method " + str.length());
		System.out.println("The length comes from logic " + LengthWithoutBuilt(str));
		
	}
}	