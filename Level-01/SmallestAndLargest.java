import java.util.*;

class Program
{
 public static int[] findSmallestAndLargest(int number1, int number2, int number3){
	  int smallest = Math.min(number1, Math.min(number2,number3));
	  int largest = Math.max(number1,Math.max(number2,number3));
	  return new int[] {largest,smallest};
	 
	 }
}

 public class SmallestAndLargest{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int num1 = sc.nextInt();
   int num2 = sc.nextInt();
   int num3 = sc.nextInt();
   
   int[] result = Program.findSmallestAndLargest(num1,num2,num3);
   
   System.out.println("The largest and smallest number are " + result[0] + " " + result[1]);
  }
}