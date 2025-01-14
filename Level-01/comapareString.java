import java.util.*;

class comapareString{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		//taking input of two strings
		String s1 = sc.next();
		String s2 = sc.next();
		
		comapareString obj = new comapareString();
		
		System.out.println(obj.compare(s1,s2));
	sc.close();
		
		}
		
	public boolean compare(String s1 , String s2){
	         
		  for(int i=0;i<s1.length();i++){
		     
			   if(s1.charAt(i)==s2.charAt(i)){
				   return true;
				   }
				   else{
					   return false;
					   }
			  }
			  
			  
		}

}