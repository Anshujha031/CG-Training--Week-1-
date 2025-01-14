import java.util.*;

class ConverterToUppercase{

public String usingLogic(String str){
	String upperStr = "";

	for(int i=0;i<str.length();i++){
		char ch = str.charAt(i);
		if(ch >= 'a' && ch <= 'z' ){
		 ch = (char)(ch-32);
		}
		upperStr += ch;
		}
		return upperStr;
}




public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string");
	String str = sc.next();
	
    String str1 = str.toUpperCase();
	
	
	ConverterToUppercase c = new ConverterToUppercase();
	
	System.out.println("String in uppercase " + c.usingLogic(str));
	
	if(str.equals(str1)){
		System.out.println("True");
		}
		else{
			System.out.println("False");
			}
	
}
}
