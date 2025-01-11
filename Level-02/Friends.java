import java.util.*;

class Friends
{ 
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	int[] age = new int[3];
	int[] height = new int[3];
	
	for(int i=0;i<3;i++){
	while(true){
		 System.out.print("Enter age: ");
		 age[i] = sc.nextInt();
		 System.out.print("Enter age: ");
		 height[i] = sc.nextInt();
		 if(age[i]>0 || height[i]>0){
			 break;
			 }
			 System.out.println("Invalid");
		}
	}
		
		int index1=0;
		
		for(int i=0;i<3;i++){
			 if(age[i] < age[index1]){
				 index1 = i;
				 }
			}
			
			int index2 = 0;
			for(int i=0;i<3;i++){
				if(height[i]>height[index2]){
					 index2=i;
					}
				}
	System.out.println(age[index1]);
	System.out.println(height[index2]);
	
}
}