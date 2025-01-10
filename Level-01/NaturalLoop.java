import java.util.*;

class NaturalLoop
{
public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   int number = sc.nextInt();
   if(number>0)
   {
       int formula = number*(number+1)/2;
	   int loop =0 ;
      while(number>0)
	  {
	    loop += number;
		number--;
	  }
	  
	  if(formula==loop)
	  {
	  System.out.println("Sum " + formula);
	  }
	  
   }
   
   
}
}