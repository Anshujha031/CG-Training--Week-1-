import java.util.*;

class ComapareCharArray{

public char[] charArray(String s){
	char[] charArr = new char[s.length()];
	for(int i=0;i<s.length();i++){
		charArr[i]=s.charAt(i);
		}
		return charArr;
}

public char[] charArrayByBuilt(String s){
	
	char[] charArr1 = s.toCharArray();
	return charArr1;
}





public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String s = sc.next();
	
	ComapareCharArray ch = new ComapareCharArray();
	
	char[] charArr = ch.charArray(s);
	char[] charArr1 = ch.charArrayByBuilt(s);
	
	 boolean res = true;
   for(int i=0;i<s.length();i++){
  
   
	   if(charArr[i]!=charArr1[i]){
		   res = false;
		   break;
		   }
	   }
	   System.out.println(res);
	
	
		
	
}

}
