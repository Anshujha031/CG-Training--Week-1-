import java.util.*;

class compareSubString{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   //input the string
   
   System.out.println("Enter the String");
   String s = sc.next();
   
   
   //input the index
    System.out.println("Enter the Starting index");
	int startIndex = sc.nextInt();
	 System.out.println("Enter the Ending index");
	 int endIndex = sc.nextInt();
	 
	 //taking substring
	
	 
	 compareSubString obj = new compareSubString();
	 System.out.println(obj.compare(s,startIndex,endIndex));
	
  }
  
  public boolean compare(String s , int startIndex , int endIndex){
	   String sub = s.substring(startIndex,endIndex);
	   
	  if(s.length()!=sub.length()){
		  return false;
		  }
	  else if(s.equals(sub)){
		  
		  return true;
		  }
		  else{
			  return false;
			  }
  }
}
