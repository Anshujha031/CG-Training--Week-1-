import java.util.*;

class Triangle
{
	public int numberRounds(int side1 , int side2 , int side3 , int distance){
		 int p = side1+side2+side3;
		 int r = distance/p;
		 return r;
		}
}

class NumberOfRounds
{
	public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 
		 //inputs of sides and distance
		 System.out.println("Enter the side1");
		 int side1 = sc.nextInt();
		 System.out.println("Enter the side2");
		 int side2 = sc.nextInt();
		 System.out.println("Enter the side3");
		 int side3 = sc.nextInt();
		 System.out.println("Enter the distance");
		 int dist = sc.nextInt();
		 
		 Triangle shakes = new Triangle();
		 System.out.println("The number of rounds are " + shakes.numberRounds(side1 , side2 , side3 ,  dist));
		 
		}
	}