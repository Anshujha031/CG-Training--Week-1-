import java.util.*;

class CollinearPoints{

    // Method to check collinearity using slope formula
    public static void areCollinearBySlope(double x1, double y1, double x2, double y2, double x3, double y3) {
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);
		
		if((slopeAB == slopeBC) && (slopeBC == slopeAC)){
			System.out.println("Points are collinear by slope formula");
		}
		else{
			System.out.println("Points are not collinear by slope formula");
		}
    }

    // Method to check collinearity using area of triangle formula
    public static void areCollinearByArea(double x1, double y1, double x2, double y2, double x3, double y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        
		if(area == 0){
			System.out.println("Points are collinear by triangle formula");
		}
		else{
			System.out.println("Points are not collinear by triangle formula");
		}
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input for three points
        System.out.print("Enter x1, y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2, y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        System.out.print("Enter x3, y3: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        areCollinearBySlope(x1, y1, x2, y2, x3, y3);
		
        areCollinearByArea(x1, y1, x2, y2, x3, y3);

        input.close();
    }
}