import java.util.*;

class Check
{
   public int chechNum(int num)
   {
	   if(num<0){
	   return -1;
	   }
	   else if(num>0){
		   return 1;
		   }
		   else{
			   return 0;
			   }
	   
	   }
}

class CheckNumber
{
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 
		 Check number = new Check();
		 
		 System.out.println("The result is " + number.chechNum(num));
		 
		}
	
}