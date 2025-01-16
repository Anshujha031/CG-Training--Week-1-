import java.util.*;

class VowelsAndConsonants2D{
	
	public static String VowelConsonant(char ch){
	
		
		 if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert to lowercase
        }

		
		
		
		
		//check if char is vowel
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
			return "Vowels" ;
			}
		else if(ch >= 'a' && ch<='z'){
			return "Consonants";
			}
		else{
			return "Not a Letter";
			}
		
		
		
	}
	
	//method to find vowels and consonnts
	public static String[][] findVowelsConsonants(String s){
		String[][] res = new String[s.length()][2];
		
		
		//loop through each character and check its type
		for(int i=0;i<s.length();i++){
		    char ch = s.charAt(i);
			res[i][0] = String.valueOf(ch);  // store the character
			res[i][1] = VowelConsonant(ch);   // store its type
			}
			
			return res;
		
		
		}
		
	
	
	
	
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = sc.nextLine();
		String[][] res = findVowelsConsonants(input);
		
		//display 2d string
		System.out.println("character\tType");
		System.out.println("**********************************************");
		
		for(int i=0;i<res.length; i++){
		System.out.println(res[i][0] + "\t\t" + res[i][1]);
			}
		
		sc.close();
		
			
		
	}
}