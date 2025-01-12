import java.util.*;

class LeapYear{

public static String leap(int n){
    if(n>=1582){
	  if(n%4==0){
	    if(n%100!=0){
		   if(n%400==0){
		       return "Yes number is LeapYear";
		   }
		   else{
		   return "Not a leapYear";
		   }
		}
		else{
		return "Not a LeapYear";
		}
	  }
	  else{
	  return "Not a LeapYear";
	  }
	}
	else{
	 return "Not a LeapYear";
	}
}




  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  System.out.println(leap(num));
  }
}