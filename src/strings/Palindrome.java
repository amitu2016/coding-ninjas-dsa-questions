package strings;

public class Palindrome {
	
	public static boolean isPalindrome(String str) {
		String reversed = "";
		char ch;
		for (int i = 0; i < str.length() ; i++) {
			
			ch = str.charAt(i);
			reversed = ch+reversed;		
		}
		
		if(str.equals(reversed)) {
			return true;
		}else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		
		String str1 = "abcba";
		String str2 = "amit";
		
		System.out.println(isPalindrome(str1));
		System.out.println(isPalindrome(str2));
	}

}
