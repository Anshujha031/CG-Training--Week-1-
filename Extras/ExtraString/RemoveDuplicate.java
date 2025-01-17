import java.util.*;

class RemoveDuplicate{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		
		String str = "";
		
		for(int i=0;i<s.length();i++){
			boolean duplicate = false;
			char ch = s.charAt(i);
			
			for(int j=0;j<str.length();j++){
				if(ch==str.charAt(j)){
					duplicate = true;
					break;
					}
				
				}
				
		if(duplicate==false){
			str+=ch;
			}
				
				
			}
			
			System.out.println(str);
		
		
		
	}
}