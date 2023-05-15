package week3.day2;

public class OddIndexToUpperCase {
	public static void main(String[] args) {
		
		String str = "changeme";
		
		char[] ch=new char[str.length()];
		for(int i = 0; i<str.length(); i++) {
	        ch[i]=str.charAt(i);        
}
		for (int j = 0; j < ch.length; j++) {
			if (j%2==0) {
				System.out.print(ch[j]);
			}
			else {
				System.out.print(Character.toUpperCase(ch[j]));
			}
			
		}
}
}