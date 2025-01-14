import java.util.*;

class CreateSubstring{
	
	// Method to create substring
	public static String createSubstring(String str, int start, int end){
		String str2 = "";
		for(int i=start; i<end; i++){
			str2 += str.charAt(i);
		}
		
		return str2;
	}
	
	// Method to compare two strings
	public static boolean stringCheck(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		
		for(int i=0; i<str1.length(); i++){
			if(str1.charAt(i) != str2.charAt(i)){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[]args){

        // Create a Scanner Object
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String string = input.next();
		System.out.println("Enter starting index");
		int startIndex = input.nextInt();
		System.out.println("Enter ending index");
		int endIndex = input.nextInt();
		
		String string1 = createSubstring(string, startIndex, endIndex);
		String string2 = string.substring(startIndex, endIndex);
		
		System.out.println(string1 + " " + string2);
		
		if(stringCheck(string1, string2)){
			System.out.println("Strings are equal");
		}
		else{
			System.out.println("Strings are not equal");
		}
		
		
		
        		
        // Close the Scanner Object
		input.close();
	}
}