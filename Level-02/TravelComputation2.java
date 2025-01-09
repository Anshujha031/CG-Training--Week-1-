import java.util.*;

class TravelComputation2{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String name = input.next();
		
		String fromCity = input.next();
	String viaCity = input.next();
	String toCity = input.next();
		
		double distanceFromToVia = input.nextDouble();
		double distanceViaToFinalCity = input.nextDouble();
		
		int timeTaken = input.nextInt();
		
	    double totalDistance = distanceFromToVia + distanceViaToFinalCity;
		
	    System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and " + "the Total Time taken is " + timeTaken + " minutes");
	}
}