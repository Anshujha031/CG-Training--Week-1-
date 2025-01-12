import java.util.*;

class chocolates{
	public static int[] chocolatesGetByEach(int n , int m){
	 int[] res = new int[2];
		res[0] = n/m;
		res[1]= n%m;
		return res;
		}
		  
		
 
}

class DistributeChocolates{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of chocolates");
		int  numberOfchocolates = sc.nextInt();
		System.out.println("Enter the number of students");
		int  numberOfChildren = sc.nextInt();
		
		int[] res = chocolates.chocolatesGetByEach(numberOfchocolates,numberOfChildren);
		
		System.out.println("The number of chocolates each student get " + res[0] +  " the ramaining chocolates " + res[1]);
		
		}
	
	}