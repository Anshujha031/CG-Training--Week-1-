import java.util.*;

class ParkRun{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double side1 = sc.nextInt();
		double side2 = sc.nextInt();
		double side3 = sc.nextInt();
		double perimeter = side1 + side2 + side3;
		double dist = 5000;
		double round = dist / perimeter;
		
		System.out.println("The total number of rounds the athlete will run is " + round + " to complete 5 km ");
	}
}