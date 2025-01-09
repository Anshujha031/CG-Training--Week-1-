import java.util.*;

class Distance{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
        double distanceInFeet = scanner.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInFeet / (1760 * 3);
        System.out.println("The distance is " + distanceInYards + " yards or " + distanceInMiles + " miles.");
        
        
	}
}