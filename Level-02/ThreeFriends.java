import java.util.*;

class ThreeFriends{
	
	public static String youngest(String[] names , int[] age){
	
	int index = 0;
		    for(int i=1;i<age.length;i++){
				if(age[i]<age[index]){
					index = i;
					}
				}
				return names[index];
		}
		
	public static String tallest(String[] names , int[] height){
		   int index = 0;
		   for(int i=1;i<height.length;i++){
			   if(height[i]>height[index]){
				   index=i;
				   }
			   }
			   return names[index];
		}



public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] ages = new int[3];
	int[] heights = new int[3];
	String[] names = {"Amar" , "Akbar" , "Anthony"};
	
	 for (int i = 0; i < names.length; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = sc.nextInt();
        }
		
		String youngest = youngest(names, ages);
        String tallest = tallest(names, heights);
		
		 System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);


	
}
}