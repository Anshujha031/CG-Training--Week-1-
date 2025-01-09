import java.util.*;

class kilometerToMiles{
	public static void main( String[] args){
		Scanner sc = new Scanner(System.in);
		double km = sc.nextInt();
		double mile = (km/1.6);
		System.out.println("The total miles is " + mile + " mile for the given " + km + " km " );
		
	}
}