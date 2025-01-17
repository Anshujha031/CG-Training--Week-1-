import java.util.*;

class Compare{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		
		for(int i=0;i<s1.length();i++){
			char ch1 = s1.charAt(i);
			char ch2 = s2.charAt(i);
			if(ch1<ch2){
				System.out.println(s1 + " comes before " + s2 + " in lexicographical order " );
				break;
			}
			else{
				System.out.println(s2 + " comes before " + s1 + " in lexicographical order " );
				break;
			}
			
		}
	}
}