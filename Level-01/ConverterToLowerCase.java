import java.util.*;

class ConverterToLowerCase{
	
	public String converLower(String s){
		String LowerStr = "";
		
		for(int i=0;i<s.length();i++){
		char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z'){
				ch = (char)(ch+32);
			}
			LowerStr += ch;
		}
		return LowerStr;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.next();
		
		ConverterToLowerCase s = new ConverterToLowerCase();
		
		String str1 = str.toLowerCase();
		
		System.out.println("String is in Lower Case " + s.converLower(str));
		
		if(str.equals(str1)){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
		
	}
}