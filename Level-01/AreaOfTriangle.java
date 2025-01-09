import java.util.*;

class AreaOfTriangle{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
        double base = scanner.nextDouble();
        
        double height = scanner.nextDouble();
        
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516; 
        System.out.println("Area of the triangle is " + areaInInches + " square inches or " + areaInCm + " square cm.");
        
	}
}