import java.util.*;

public class stdentVodeChecker{

public static boolean canStudentVote(int age){
	if(age<=0){
	return false;
	}
	else{
		 if(age>=18){
			 return true;
			 }
			 else{
				 return false;
				 }
		}
}

public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int[] arr = new int[10];
	for(int i=0;i<10;i++){
		arr[i] = sc.nextInt();
		System.out.println(canStudentVote(arr[i]));
		}
}

}