import java.util.*;

class CheckSpring
{
public String spring(int month , int day)
{
  if(((month==3) && (day <=20 || day <=31)) || ((month==4) && (day >=1 || day<=30 )) || ((month==5) && (day >=1 || day<=31 )) || ((month==6) && (day >= 1 || day<=20))){
	   return "Its a Spring Season";
	  }	
	else{
		return "Its not a Spring Season";
		}
}
}

class CheckSpringSeason
{ 
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the month and day");
		 int month = sc.nextInt();
		 int day = sc.nextInt();
		 
		 CheckSpring check = new CheckSpring();
		 System.out.println(check.spring(month,day));
		 sc.close();
		}
}