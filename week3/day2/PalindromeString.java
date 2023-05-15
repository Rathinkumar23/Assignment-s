package week3.day2;

public class PalindromeString {

	public static void main(String[] args) {
		String value="madam";
		String res="";
		for (int i = value.length()-1;i >=0;  i--) {
			res=res+value.charAt(i);
		}
		System.out.println(res);
		if (value.equals(res)) {
			System.out.println("THE GIVEN WORD IS PALINDROME");
		}
		else {
			System.out.println("THE GIVEN WORD IS NOT A PALINDROME");
		}
	}

}
