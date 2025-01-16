import java.util.*;

class VowelsAndConsonants{
	
	public static int[] VowelConsonant(String s){
	
	    int vowel =0;
		int consonent = 0;
		
		String lowerStr = s.toLowerCase();
		
		for(int i=0;i<s.length();i++){
		char ch = lowerStr.charAt(i);
		
		//chaeck if char is vowel
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
			vowel++;
			}
		else if(ch >= 'a' && ch<='z'){
			consonent++;
			}
		
		}
		return new int[]{vowel , consonent};
	}
	
	
	
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		int[] count = VowelConsonant(s);
		
			System.out.println("Vowels : " + count[0] + " " + " Consonants " + count[1]);
		
	}
}